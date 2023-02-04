package Exercicios_POO;
import java.util.Locale;				//efetua exatamente a saida pedida no exercicio usando uma logica diferente,
import java.util.Scanner;				//DETALHE IMPORTANTE: O arquivo Bank com a Classe BankAccount
										//porém, o mais ideial seria essa solução com a Classe Account
import Entidades.Account;

public class CorreçãoBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter a initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: "); 
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update data: ");
		System.out.println(account);
		
		sc.close();

	}

}
