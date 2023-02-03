import java.util.Locale;
import java.util.Scanner;

import Util.Calculator2;

public class membrosEstaticos3 {

	public static void main(String[] args) {
		/*Problema Exemplo
		 * 
			Fazer um programa para ler um valor numérico qualquer, e daí mostrar
			quanto seria o valor de uma circunferência e do volume de uma esfera
			para um raio daquele valor. Informar também o valor de PI com duas
			casas decimais. */
		
		//Versão 3.0 - classe Calculator com metodo estatico

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Calculator calc = new Calculator(); com metodo estatico não preciso instanciar o objeto para depois fazer a chamada*/ 
		
		
		System.out.printf("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator2.circunference(radius); //Com metodo estatico eu chamo diretamente pelo nome da classe
		
		double v = Calculator2.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator2.PI);
		
		
		sc.close();
	}

}
