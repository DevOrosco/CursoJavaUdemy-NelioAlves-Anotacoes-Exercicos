package Util;

public class CurrencyConverter {
 
	public static double Convert(double dollar, double dollarBought) {
		
		double dollarPrice =  dollar * dollarBought;
		
		return dollarPrice += dollarPrice * 6/100;
	}
}
