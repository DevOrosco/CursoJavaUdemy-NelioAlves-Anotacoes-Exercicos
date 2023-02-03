import java.util.Locale;
import java.util.Scanner;

import Entidades.ProductEncapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
		/*É um princípio que consiste em
		esconder detalhes de implementação
		de uma classe, expondo apenas
		operações seguras e que mantenham
		os objetos em um estado consistente.*/
		
		//REGRA GERAL BASICA
		
		/*Um objeto NÃO deve expor nenhum atributo (modificador de acesso
		private)
		
		*Os atributos devem ser acessados por meio de métodos get e set*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ProductConstrutor product = new ProductConstrutor(); Como foi declarado um construtor na classe, essa instancia só pode vir depois com os parametros
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		ProductEncapsulamento product = new ProductEncapsulamento(name, price); //Instancia com parametros obrigando a iniciar já com dados do produto
		
		/*product.name = "Computer"; Instacia para quando o atributo do objeto é publico*/
		product.setName("Computer"); //Instancia para acessar o atributo privado do objeto, fazendo a alteração do valor do atributo
		
		System.out.println("Updated Name: " + product.getName()); //Metodo getName acessa e retorna o valor atribuido ao atributo do objeto, no caso 'name'.
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Enter number of products to be removed from stock");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		sc.close();

		

	}

}
