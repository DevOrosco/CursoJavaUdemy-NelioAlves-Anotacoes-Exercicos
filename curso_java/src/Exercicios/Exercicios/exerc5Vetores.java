package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exerc5Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EXERCICIO 5");
		/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
		o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
		considerando a primeira posição como 0 (zero)*/
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		int indiceDoMaior = 0;
		double maior = 0;
		double[] vect = new double[n];
		
		for(int i = 0;i < vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		for(int i = 0;i < vect.length;i++) {
			if(vect[i] > maior) {
				maior = vect[i];
			}	
		}
		
		for(int i = 0;i < vect.length;i++) {
			if(vect[i] == maior) {
				indiceDoMaior = i;
			}	
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f%n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d", indiceDoMaior);
		
		
		sc.close();
	}
}
