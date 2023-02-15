package _POO;

import java.util.Locale;
import java.util.Scanner;

import Entidades.ProductVetor;

public class Vetores_POO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVetor[] vect = new ProductVetor[n]; //Instanciando a Classe como um Vetor
		
		for(int i = 0; i < vect.length; i++) { //Percorrendo o Vetor para alocar valores
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVetor(name, price); //Alocando valores criando classes com os construtores
		}
		
		double sum = 0.0;
		
		for(int i = 0;i < vect.length;i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();

	}

}
