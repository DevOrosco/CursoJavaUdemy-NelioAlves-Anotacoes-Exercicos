package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exerc2Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EXERCICIO 2");
		/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		- Imprimir todos os elementos do vetor
		- Mostrar na tela a soma e a média dos elementos do vetor*/
		
		System.out.print("Quantos numeros você vai digitar? ");
		
		int n = sc.nextInt();
		
		while(n > 10) {
			System.out.println("O maximo de numeros que podem ser digitadados é 10, digite um número menor");
			n = sc.nextInt();
		}
		
		double[] vect = new double[n];
		
		for(int i=0; i < vect.length; i++) { //Percorrendo vetor para adicionar valores aos indices
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < vect.length;i++) {
			sum += vect[i];
		}
		
		double avg = sum / vect.length;
		
		System.out.print("\nVALORES = ");
		
		for(int i = 0;i < vect.length;i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.printf("%nSOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", avg);

		sc.close();
	}

}
