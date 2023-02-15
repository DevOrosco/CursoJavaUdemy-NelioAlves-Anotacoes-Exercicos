package Exercicios;

import java.util.Locale;
import java.util.Scanner;

import Entidades.PersonExerc3Vetores;

public class exerc3Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EXERCICIO 3");
		/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
		tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
		bem como os nomes dessas pessoas caso houver*/
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		int age;
		int qtdMinorAge = 0;
		String name;
		double height;
		
		PersonExerc3Vetores[] person = new PersonExerc3Vetores[n];
	
		
		for(int i = 0;i < person.length;i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:%n", i);
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Idade: ");
			age = sc.nextInt();
			System.out.print("Altura: ");
			height = sc.nextDouble();
			
			person[i] = new PersonExerc3Vetores(name, age, height);
		}
		
		double sumHeight = 0.0;
		
		for(int i = 0;i < person.length;i++) {
			sumHeight += person[i].getHeight();
		}
		
		double avgHeight = sumHeight / person.length;
		
		
		for(int i = 0;i<person.length;i++) {
			if(person[i].getAge() < 16) {
				qtdMinorAge++;
			}else {
				qtdMinorAge = 0;
			}
		}
		
		double percentageMinorAge = ((double)qtdMinorAge / person.length) * 100.00;
		
		System.out.println();
		
		System.out.printf("Altura média: %.2f%n", avgHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentageMinorAge);
		for(int i = 0;i<person.length;i++) {
			if(person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}
		}
		
		sc.close();

	}

}
