package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exerc4Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EXERCICIO 4");
		/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
		tela todos os números pares, e também a quantidade de números pares.*/
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		int qtdPares = 0;
		int[] pares = new int[n];
		
		for(int i = 0;i < pares.length;i++) {
			System.out.print("Digite um numero: ");
			pares[i] = sc.nextInt();
			
			if(pares[i] % 2 == 0) {
				qtdPares++;
			}
		}
		
		System.out.println("\nNUMEROS PARES: ");
		for(int i = 0;i < pares.length;i++) {
			if(pares[i] % 2 == 0) {
				System.out.printf("%d ", pares[i]);
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + qtdPares);
		
		sc.close();
	}

}
