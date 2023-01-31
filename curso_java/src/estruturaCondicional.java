import java.util.Scanner;

public class estruturaCondicional {

	public static void main(String[] args) {
		int x = 10;
		int horas;
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Bom dia");
			
			if(x > 5) { //Estrutura Simples
				System.out.println("Boa tarde");
			}
			
			if(x > 10) { //Estrutura Composta
				System.out.println("Boa noite");
			}else {
				System.out.println("Bom dia");
			}
			
			System.out.println("Que horas são?");
			horas = sc.nextInt();
		
		if(horas < 12) {
			System.out.println("Bom dia");
		}else {
			if(horas < 18) {			/*Encadeamento de Estrutura Condicional*/
				System.out.println("Boa tarde");
			}else {
				System.out.println("Boa noite");
			}
		}
		
		sc.close();
	}

}
