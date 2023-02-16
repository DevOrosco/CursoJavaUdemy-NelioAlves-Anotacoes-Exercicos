package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exerc8Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EXERCICIO 8");
		/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
		aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
		digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/
		
		System.out.print("Quantos elementos vai ter o vetor? ");
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
		
		double sum = 0;
		for(int i = 0;i < pares.length;i++) {
			if(pares[i] % 2 == 0) {
				sum += pares[i];
			}
		}
		
		double avgPares = sum / qtdPares;

		if(qtdPares >= 1) {
			System.out.printf("MEDIA DOS PARES = %.1f", avgPares);
		}else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}

}
