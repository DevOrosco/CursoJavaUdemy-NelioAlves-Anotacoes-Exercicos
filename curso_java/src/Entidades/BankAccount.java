package Entidades;

public class BankAccount {
	private String name;
	private int numberAccount;
	private double initialValue;
	
	public BankAccount(String name, int numberAccount) {
		this.name = name;
		this.numberAccount = numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public double getInitialValue() {
		return initialValue;
	}

	public void setInitialValue(double initialValue) {
		this.initialValue = initialValue;
	}
	
	public double deposit(double deposit, double initialValue) {
		 initialValue += deposit;
		 setInitialValue(initialValue);
		 return initialValue;
	}
	
	public double withdraw(double withdraw, double initialValue) {
		this.initialValue -= withdraw + 5;
		setInitialValue(this.initialValue);
		return this.initialValue;
	}
}
