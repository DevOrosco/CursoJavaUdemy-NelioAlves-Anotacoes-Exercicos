package Exercicios_POO;

import java.util.Locale;
import java.util.Scanner;

import Util.CurrencyConverter;
 
public class membrosEstaticoExerc {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price?");
		double dollar = sc.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		double dollarBought = sc.nextDouble();
		
		System.out.printf("Amout to be paid in reais = %.2f", CurrencyConverter.Convert(dollar, dollarBought));
		
		sc.close();
	}
}
