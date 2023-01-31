package Exercicios_POO;

import java.util.Locale;
import java.util.Scanner;
import Entidades.Employee;

public class Exercicio2 {

	public static void main(String[] args) {
		
		System.out.println("EXERCICIO 2");
		/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
		seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
		salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
		afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
		projetada abaixo.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employ = new Employee();
		System.out.println("Enter Employee Name: ");
		employ.name = sc.nextLine();
		System.out.println("Enter Employee GrossSalary: ");
		employ.grossSalary = sc.nextDouble();
		System.out.println("Enter Salary Tax: ");
		employ.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f%n", employ.name, employ.NetSalary());
		System.out.println("Which percentage to increase salary?");
		double percent = sc.nextDouble();
		
		System.out.printf("Update data: %s, $ %.2f%n", employ.name, employ.IncreaseSalary(percent));
		
		sc.close();
	}

}
