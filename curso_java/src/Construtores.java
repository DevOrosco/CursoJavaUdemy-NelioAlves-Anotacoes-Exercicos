import java.util.Locale;
import java.util.Scanner;

import Entidades.ProductConstrutor;

public class Construtores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ProductConstrutor product = new ProductConstrutor(); Como foi declarado um construtor na classe, essa instancia só pode vir depois com os parametros
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		ProductConstrutor product = new ProductConstrutor(name, price, quantity); //Instancia com parametros obrigando a iniciar já com dados do produto
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
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