package Exercicios;
import java.util.Scanner;
import java.util.Locale;

public class ExercIniciante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("EXERCICIO 1");
		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.*/
		
		Scanner sc = new Scanner(System.in);
		
		int number1, number2;
		
		System.out.println("Digite um número: ");
		number1 = sc.nextInt();
		System.out.println("Digite um número: ");
		number2 = sc.nextInt();
		
		int result = number1 + number2;
		
		System.out.println("O resultado da Soma é: " + result);
		
		/******************************************************************************************************************************************/
		
		System.out.println("EXERCICIO 2");
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.
		
		Fórmula da área: area = π . raio2
		
		Considere o valor de π = 3.14159*/
		
		double raio;
		
		System.out.println("Insira a medida do raio do Circulo");
		raio = sc.nextDouble();
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A area do circulo mede: %.4f", area);
		
		/******************************************************************************************************************************************/
		
		System.out.println("EXERCICIO 3");
		/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
		
		int numberOne, numberTwo, numberThree, numberFour;
		
		System.out.println("Insira um número: ");
		numberOne = sc.nextInt();
		System.out.println("Insira um número: ");
		numberTwo = sc.nextInt();
		System.out.println("Insira um número: ");
		numberThree = sc.nextInt();
		System.out.println("Insira um número: ");
		numberFour = sc.nextInt();
		
		int diff = (numberOne * numberTwo) - (numberThree * numberFour);
		
		System.out.println("A difereça do produto dos 4 numeros é: " + diff);

		/******************************************************************************************************************************************/
		
		System.out.println("EXERCICIO 4");
		/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		decimais.*/
		
		int employeeNumber, workHours;
		double valuePerHour;
		
		System.out.println("Digite o ID do Funcionario: ");
		employeeNumber = sc.nextInt();
		System.out.println("Digite as horas trabalhadas: ");
		workHours = sc.nextInt();
		System.out.println("Digite o valor recebido por horas trabalhada");
		valuePerHour = sc.nextDouble();
		
		double salary = workHours * valuePerHour;
		
		System.out.printf("ID NUMBER: %d%nSALARY: %.2f%n", employeeNumber, salary);
		
		/******************************************************************************************************************************************/
		
		System.out.println("EXERCICIO 5");
		/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
		
		int id_peca1, id_peca2,num_peca1, num_peca2;
		double price_peca1, price_peca2;
		
		System.out.println("Digite o ID da 1º Peça: ");
		id_peca1 = sc.nextInt();
		System.out.println("Digite a Qtd da 1º Peça: " + id_peca1);
		num_peca1 = sc.nextInt();
		System.out.println("Digite o valor unitário de cada peça: ");
		price_peca1 = sc.nextDouble();
		
		System.out.println("Digite o ID da 2º Peça: ");
		id_peca2 = sc.nextInt();
		System.out.println("Digite a Qtd da 2º Peça: " + id_peca2);
		num_peca2 = sc.nextInt();
		System.out.println("Digite o valor unitário de cada peça: ");
		price_peca2 = sc.nextDouble();
		
		double subTotal = (num_peca1 * price_peca1) + (num_peca2 * price_peca2);
		
		System.out.printf("VALOR A PAGAR: %.2f ", subTotal);
		
		/******************************************************************************************************************************************/
		
		System.out.println("EXERCICIO 6");
		/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		mostre:
			a) a área do triângulo retângulo que tem A por base e C por altura.
			b) a área do círculo de raio C. (pi = 3.14159)
			c) a área do trapézio que tem A e B por bases e C por altura.
			d) a área do quadrado que tem lado B.
			e) a área do retângulo que tem lados A e B.*/
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}

}
