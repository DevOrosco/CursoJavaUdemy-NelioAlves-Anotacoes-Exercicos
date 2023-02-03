
import java.util.Scanner;
import java.util.Locale;

public class membrosEstaticos {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		/*Problema Exemplo
		 * 
			Fazer um programa para ler um valor numérico qualquer, e daí mostrar
			quanto seria o valor de uma circunferência e do volume de uma esfera
			para um raio daquele valor. Informar também o valor de PI com duas
			casas decimais. */
		
		//Versão 1.0 - Metodos na propria Classe do Programa

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circunference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		//Versão 2.0 - classe Calculator com membros de instância
		//Versão 3.0 - classe Calculator com metodo estatico
		
		sc.close();
	}
	
	//Funcões Versão 1.0
	public static double circunference(double radius) { //Função é static, em uma classe static, eu não consigo chamar metodos non-static
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
