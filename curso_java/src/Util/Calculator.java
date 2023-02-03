package Util;

public class Calculator {
	
	public final double PI = 3.14159;
	
	public double circunference(double radius) { //Função é static, em uma classe static, eu não consigo chamar metodos non-static
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
