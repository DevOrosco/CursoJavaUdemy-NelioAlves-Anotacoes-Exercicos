package Entidades;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade(double nota1,double nota2,double nota3) {
		return nota1 + nota2 + nota3;
	}
	 
	public double missingPoints() {
		if (finalGrade(nota1, nota2, nota3) < 60.0) {
			return 60.0 - finalGrade(nota1, nota2, nota3);
		}else {
			return 0.0;
		}
	}
}
