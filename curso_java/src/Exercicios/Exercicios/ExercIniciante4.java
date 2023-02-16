package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class ExercIniciante4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EXERCICIO 1");
		/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
		X, se for o caso.*/
		
		int number;
		
		System.out.println("Insira um número de 1 até 1000: ");
		number = sc.nextInt();
		
		for(int i = 0;i <= number;i++) {
			if(i % 2 >= 1) {
				System.out.println(i);
			}
		}
		
		/******************************************************************************************************************************************/
		System.out.println("EXERCICIO 2");
		/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
		essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/
		
		int num, in = 0, out = 0;
		
		System.out.println("Insira a quantidade de numeros que deseja inserir: ");
		num = sc.nextInt();
		
		for(int i = num; i != 0; i--) {
			System.out.println("Insira um número: ");
			int number1 = sc.nextInt();
			
			if(number1 >= 10 && number1 <= 20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		
		System.out.printf("%d in %n%d out", in, out);
		
		/******************************************************************************************************************************************/
		System.out.println("EXERCICIO 3");
		/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
		de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
		conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
		peso 5.*/
		
		int numTests;
		double n1, n2, n3, media = 0;
		
		System.out.println("Insira a quantidade de Testes");
		numTests = sc.nextInt();
		
		for(int i = numTests; i != 0;i--) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			
			n1 *= 2;
			n2 *= 3;
			n3 *= 5;
			media = 0;
			media += (n1 + n2 + n3) / 10;
			
			System.out.printf("%.1f", media);
		}
		
		/******************************************************************************************************************************************/
		System.out.println("EXERCICIO 4");
		/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/
		
		int numDePares, numParNumerador, numParDenominador;
		
		System.out.println("Insira o número de vezes que vai executar o programa: ");
		numDePares = sc.nextInt();
		
		for(int i = numDePares; i != 0; i--) {
			numParNumerador = sc.nextInt();
			numParDenominador = sc.nextInt();
			
			if(numParDenominador != 0) {
				double div = (double) numParNumerador / numParDenominador;
				System.out.println(div);
			}else {
				System.out.println("divisao impossivel");
			}
			
		}
		
		/******************************************************************************************************************************************/
		System.out.println("EXERCICIO 5");
		/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		Lembrando que, por definição, fatorial de 0 é 1.*/
		
		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		/******************************************************************************************************************************************/
		System.out.println("EXERCICIO 6");
		/*Ler um número inteiro N e calcular todos os seus divisores.*/
		
		int numInt;
		
		numInt = sc.nextInt();
		
		for(int i = 1; i <= numInt; i++) {
			if(numInt % i == 0) {
				System.out.println(i);
			}
		}
		
		/******************************************************************************************************************************************/
		System.out.println("EXERCICIO 7");
		/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
		começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		exemplo.*/
		
		int numLinha;
		
		numLinha = sc.nextInt();
		
		for(int i = 1; i <= numLinha; i++) {
			System.out.printf("%d %.0f %.0f%n",i,Math.pow(i, 2), Math.pow(i, 3 ) );
		}
		
		sc.close();
	}

}
