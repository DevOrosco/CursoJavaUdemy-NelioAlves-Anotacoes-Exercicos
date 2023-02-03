package Util;

public class Calculator2 {
	
	public static final double PI = 3.14159;
	
	public static double circunference(double radius) { //Função é static, em uma classe static, eu não consigo chamar metodos non-static
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
