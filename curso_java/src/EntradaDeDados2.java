import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); // Quando você usa um comando de leitura diferente do nextLine() e da alguma quebra de linha, essa quebra de linha fica 'pendente' na entrada padrão. Por isso é necessario um nextLine() sem atribuição de Variavel para consumir essa quebra de linha sem prejudicar a saida do programa
		s1 = sc.nextLine(); //nextLine() -- utilizado para ler a linha inteiro EX: Bom dia. O metodo next() só lê o primeiro valor no caso de "Bom dia", a saida seria só "Bom".
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
