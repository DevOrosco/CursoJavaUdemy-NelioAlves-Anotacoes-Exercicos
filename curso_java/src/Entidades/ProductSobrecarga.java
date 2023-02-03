package Entidades;

public class ProductSobrecarga {
	public String name;
	public double price;
	public int quantity;
	
	public ProductSobrecarga() { //Construtor padrão "ProductSobrecarga p = new ProductSobrecarga();"
	}
	
	public ProductSobrecarga(String name, double price, int quantity) {
		this.name = name; //"this", uitlizado para diferenciar atributos de variaveis locais, para acessar o dado do objeto
		this.price = price;
		this.quantity = quantity;
	}
	
	/*A sobrecarga se trata sobre disponibilizar mais de uma versão da mesma operação onde a diferença se encontra nos parametros*/
	
	public ProductSobrecarga(String name, double price) {
		this.name = name; //"this", uitlizado para diferenciar atributos de variaveis locais, para acessar o dado do objeto
		this.price = price;
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

