package Exercicios_POO;

import java.util.Locale;
import java.util.Scanner;
import Entidades.Student;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Enter Student Name: ");
		student.name = sc.nextLine();
		System.out.println("Enter First Quarter Note: ");
		student.nota1 = sc.nextDouble();
		System.out.println("Enter Second Quarter Note: ");
		student.nota2 = sc.nextDouble();
		System.out.println("Enter Third Quarter Note: ");
		student.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade(student.nota1,student.nota2,student.nota3));
		if (student.finalGrade(student.nota1,student.nota2,student.nota3) < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
