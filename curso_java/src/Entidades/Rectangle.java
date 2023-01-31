package Entidades;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area( double width,double height ){
		return width * height;
	}
	
	public double perimetro(double width, double height) {
		return(width * 2) + (height * 2);
	}
	
	public double diagonal(double width, double height) {
		double d = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return d;
	}
}
