package Exercicios_Iniciantes;
import java.util.Scanner;
import java.util.Locale;

public class ExercIniciante2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EXERCICIO 1");
		/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
		
		int number;
		
		System.out.println("Digite um número inteiro: ");
		number = sc.nextInt();
		
		if(number > 0) {
			System.out.println("NÃO NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		
		/******************************************************************************************************************************************/
		
		System.out.println("EXERCICIO 2");
		/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar*/
		
		int numberOne;
		
		System.out.println("Digite um número inteiro");
		numberOne = sc.nextInt();
		
		
		if(numberOne % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		/******************************************************************************************************************************************/
		
		System.out.println("EXERCICIO 3");
		/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		ordem crescente ou decrescente.*/
		
		int A;
		int B;
		
		System.out.println("Digite 2 Numeros: ");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		}else {
			System.out.println("Não são Multiplos");
		}
		
		/******************************************************************************************************************************************/

		System.out.println("EXERCICIO 4");
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		
		int horasDia  = 24;
		int horaInicial;
		int horaFinal;
		int duracaoJogo;
		
		System.out.println("Digite a hora Inicial do Jogo");
		horaInicial = sc.nextInt();
		System.out.println("Digite a hora Final do Jogo");
		horaFinal = sc.nextInt();
		
		duracaoJogo = horasDia - horaInicial;
		duracaoJogo = duracaoJogo + horaFinal;
		
		if(duracaoJogo > horasDia) {
			duracaoJogo -=  horasDia;
			System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
		}else {
			System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
		}
		
		/******************************************************************************************************************************************/
		
		System.out.println("EXERCICIO 5");
		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		seguir, calcule e mostre o valor da conta a pagar.*/
		
		int opcao;
		int qtdOpcao;
		double subTotal = 0;
		
		System.out.println("Digite a opção desejada: ");
		opcao = sc.nextInt();
		System.out.println("Digite a Qtd da Opcão: " + opcao);
		qtdOpcao = sc.nextInt();
		
		if(opcao == 1) {
			subTotal = qtdOpcao * 4;
		}else if(opcao == 2) {
			subTotal = qtdOpcao * 4.5;
		}else if(opcao == 3) {
			subTotal = qtdOpcao * 5;
		}else if(opcao == 4) {
			subTotal = qtdOpcao * 2;
		}else if(opcao == 5) {
			subTotal = qtdOpcao * 1.5;
		}
		
		System.out.printf("TOTAL: R$ %.2f", subTotal);
		
		/******************************************************************************************************************************************/
		
		System.out.println("EXERCICIO 6");
		/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/
		
		double interval;
		
		System.out.println("Digite um número para verificar o intervalo em que ele se encontra");
		interval = sc.nextDouble();
		
		if(interval > 0 && interval <= 25) {
			System.out.println("Intervalo [0, 25]");
		}else if(interval > 25 && interval <= 50) {
			System.out.println("Intervalo [25, 50]");
		}else if(interval > 50 && interval <= 75) {
			System.out.println("Intervalo [50, 75]");
		}else if(interval > 75 && interval <= 100) {
			System.out.println("Intervalo [75, 100]");
		}else {
			System.out.println("Fora de Intervalo");
		}
		
		/******************************************************************************************************************************************/
		
		System.out.println("EXERCICIO 7");
		/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
		ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		Se o ponto estiver na origem, escreva a mensagem “Origem”.
		Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		situação.*/
		
		double X, Y;
		
		System.out.println("Insira o valor do Eixo X e Y: ");
		X = sc.nextDouble();
		Y = sc.nextDouble();
		
		if(X > 0 && Y > 0) {
			System.out.println("Q1");
		}else if(X < 0 && Y > 0){
			System.out.println("Q2");
		}else if(X < 0 && Y < 0) {
			System.out.println("Q3");
		}else if(X > 0 && Y < 0) {
			System.out.println("Q4");
		}else {
			System.out.println("Origem");
		}
		
		/******************************************************************************************************************************************/
		
		System.out.println("EXERCICIO 8");
		/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
		que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
		qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		
		Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
		mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		
		Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
		salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
		de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
		duas casas decimais.*/
		
		double salario = sc.nextDouble();
		
		double imposto;
		
		if (salario <= 2000.0) {
			imposto = 0.0;
		}else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

}
