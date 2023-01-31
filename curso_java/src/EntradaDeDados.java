import java.util.Scanner; //Importando o Scanner da JDK para ler dados
import java.util.Locale;

public class EntradaDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); //Instanciando um Scanner para Utilizar
		
		String x;
		int y;
		double z;
		x = sc.next(); //Definindo que o Scanner vai ler dados tipo String
		y = sc.nextInt(); //Definindo que o Scanner vai ler dados tipo Inteiro
		z = sc.nextDouble(); //Definindo que o Scanner vai ler dados tipo Flutuante
		System.out.printf("Você digitou: %s, %d, %.2f ", x, y, z);
		sc.close(); //Fechando o Scanner após a leitura de dados
	}

}
