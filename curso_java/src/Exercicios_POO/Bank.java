package Exercicios_POO;

import java.util.Locale;
import java.util.Scanner;

import Entidades.BankAccount;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter acount holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n)");
		String answer = sc.next();
		
		while(!answer.equals("y") && !answer.equals("n")) {
			System.out.println("Invalid argument, try 'y' or 'n' !");
			answer = sc.nextLine();
		}
		
		BankAccount acc = new BankAccount(name, accountNumber);
		
		double initialValue = 0;
		if(answer.equals("y")) {
			System.out.printf("Enter initial deposit value: ");
			initialValue = sc.nextDouble();
			acc.setInitialValue(initialValue);
			System.out.println();
		}else {
			acc.setInitialValue(0);
			System.out.println();
		}
		
		System.out.printf("Account data: %nAccount %d, Holder: %s, Balance: $ %.2f%n%n", acc.getNumberAccount(), acc.getName(), acc.getInitialValue());
		
		System.out.printf("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		acc.deposit(deposit, initialValue);
		
		System.out.printf("Update data: %nAccount %d, Holder: %s, Balance: $ %.2f%n%n", acc.getNumberAccount(), acc.getName(), acc.getInitialValue());
		
		System.out.printf("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw, initialValue);
		
		System.out.printf("Update data: %nAccount %d, Holder: %s, Balance: $ %.2f%n%n ", acc.getNumberAccount(), acc.getName(), acc.getInitialValue());
		
		sc.close();

	}

}
