package Exercicios;
import java.util.Scanner;

public class ExercIniciante3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EXERCICIO 1");
		/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002*/
		
		int senha = 2002;
		int senhaInserida;
		
		System.out.println("Insira a senha");
		senhaInserida = sc.nextInt();
		
		while(senhaInserida != senha) {
			System.out.println("Senha Invalida \nTente novamente: ");
			senhaInserida = sc.nextInt();
		}
		
		System.out.println("Acessso Permitido");
		
		/******************************************************************************************************************************************/
		
		System.out.println("EXERCICIO 2");
		/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/
		
		int X, Y;
		
		System.out.println("Insira as coordenadas X e Y");
		X = sc.nextInt();
		Y = sc.nextInt();
		
		while(X != 0 && Y != 0) {
			
			if(X > 0 && Y > 0) {
				System.out.println("Q1");
			}else if(X < 0 && Y > 0){
				System.out.println("Q2");
			}else if(X < 0 && Y < 0) {
				System.out.println("Q3");
			}else if(X > 0 && Y < 0) {
				System.out.println("Q4");
			}
			
			System.out.println("Insira as coordenadas X e Y");
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
		/******************************************************************************************************************************************/
		System.out.println("EXERCICIO 3");
		/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
		um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
		que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
		mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
		exemplo.*/
		
		int opcao; 
		
		System.out.println("Insira a opção desejada: \n 1.Álcool \n 2.Gasolina \n 3.Diesel \n 4.Fim");
		opcao = sc.nextInt();
		int qtdAlcool = 0, qtdGasolina = 0, qtdDiesel = 0;
		
		while(opcao != 4) {
			switch(opcao) {
				case 1:
					qtdAlcool += 1;
					break;
				case 2:
					qtdGasolina += 1;
					break;
				case 3:
					qtdDiesel += 1;
					break;
				default:
					System.out.println("Insira um valor de 1 a 4");
					
			}
			
			System.out.println("Insira a opção desejada: \n 1.Álcool \n 2.Gasolina \n 3.Diesel \n 4.Fim");
			opcao = sc.nextInt();
		}
		
		System.out.printf("OBRIGADO %n Alcool: %d%n Gasolina: %d%n Diesel: %d%n", qtdAlcool, qtdGasolina, qtdDiesel);
		
		sc.close();
	}

}
