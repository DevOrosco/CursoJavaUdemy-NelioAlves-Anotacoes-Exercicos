package Exercicios_POO;

import java.util.Scanner;
import java.util.Locale;
import Entidades.Rectangle;

public class Exercicio1 {

	public static void main(String[] args) {
		System.out.println("EXERCICIO 1");
		/*Fazer um programa para ler os valores da largura e altura de um retângulo.
		 Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma classe
		 como mostrado no projeto ao lado.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle reta = new Rectangle();
		System.out.println("Enter rectangle width: ");
		reta.width = sc.nextDouble();
		System.out.println("Enter rectangle height: ");
		reta.height = sc.nextDouble();
		
		sc.close();
		
		System.out.printf("AREA = %.2f%n",reta.area(reta.width, reta.height));
		System.out.printf("PERIMETRO = %.2f%n",reta.perimetro(reta.width, reta.height));
		System.out.printf("DIAGONAL = %.2f%n",reta.diagonal(reta.width, reta.height));
		
		
		
			
		
	}

}
