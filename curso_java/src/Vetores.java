import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n]; //Declarando vetor
		
		for(int i=0; i < n; i++) {  //Percorrendo vetor para adicionar valores aos indices
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0;i < n;i++) { //Percorrendo vetor para somar valor dos indices
			sum += vect[i];
		}
		
		double avg = sum / vect.length; //Calculando a media com o tamanho do vetor
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();
		
	}

}
