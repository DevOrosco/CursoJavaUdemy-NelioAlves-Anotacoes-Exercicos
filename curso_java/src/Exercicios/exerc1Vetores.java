package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exerc1Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EXERCICIO 1");
		/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos*/
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		while(n > 10) {
			System.out.println("O maximo de numeros que podem ser digitadados é 10, digite um número menor");
			n = sc.nextInt();
		}
		
		int[] vect = new int[n];
		
		for(int i=0; i < vect.length; i++) {  //Percorrendo vetor para adicionar valores aos indices
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
