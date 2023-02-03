package Entidades;

public class ProductConstrutor {
	
	public String name;
	public double price;
	public int quantity;
	
	public ProductConstrutor(String name, double price, int quantity) {
		this.name = name; //"this", uitlizado para diferenciar atributos de variaveis locais, para acessar o dado do objeto
		this.price = price;
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity; // This se refere a "quantity" da classe Product, sem o this se refere a
									// quantity dentro da função, ou seja, o parametro
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
