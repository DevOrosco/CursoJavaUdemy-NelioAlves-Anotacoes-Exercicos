import java.util.Locale;
import java.util.Scanner;

import Util.Calculator;

public class membrosEstaticos2 {

	public static void main(String[] args) {
		/*Problema Exemplo
		 * 
			Fazer um programa para ler um valor numérico qualquer, e daí mostrar
			quanto seria o valor de uma circunferência e do volume de uma esfera
			para um raio daquele valor. Informar também o valor de PI com duas
			casas decimais. */
		
		//Versão 2.0 - classe Calculator com membros de instância

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator(); //Instanciando o objeto classe Calculator
		
		
		System.out.printf("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circunference(radius); //Chamando membro de instancia
		
		double v = calc.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		//Versão 3.0 - classe Calculator com metodo estatico
		
		sc.close();
	}

}