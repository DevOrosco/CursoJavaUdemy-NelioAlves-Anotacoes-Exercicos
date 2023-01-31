import java.util.Locale; //Importação do JDK para utilizar o Locale

public class Main {

	public static void main(String[] args) {
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.print(x); //...print - Imprime o valor da variavel sem quebra de linha
		System.out.println(x); //...println - Imprime o valor da variavel com quebra de linha
		System.out.printf("%.2f%n", x); //...printf - Imprime o alor da variavel com o valor formatado usando "%.2f" e para quebra de linha /n ou %n logo em seguida do f
		//Saida do Programa -- 10,36 -- Eclipse puxa o padrão da Linguagem do PC por isso o resultado sai com virgula.
		Locale.setDefault(Locale.US); //Locale muda o padrão de Virgula para Ponto de acordo com o selecionado, no caso, USA.
		System.out.println("RESULTADO = " + x + " METROS"); //Concatenação com println, escreve o texto entre aspas e com + junta se a variavel.
		System.out.printf("RESULTADO = %.2f metros %n", x); //Concatenação com printf, escreve todo o texto e junto dele faz a marcação da variavel EX: %.2f..., em seguida coloca a variavel
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); //Marcadores de Variavel $s - Texto, %d - Num Inteiro, %.2f - Num Flutuante. 
	}

}
