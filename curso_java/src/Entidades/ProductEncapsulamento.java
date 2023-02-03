package Entidades;

public class ProductEncapsulamento {
	private String name;
	private double price;
	private int quantity;
	
	public ProductEncapsulamento() { //Construtor padrão "ProductSobrecarga p = new ProductSobrecarga();"
	}
	
	public ProductEncapsulamento(String name, double price, int quantity) {
		this.name = name; //"this", uitlizado para diferenciar atributos de variaveis locais, para acessar o dado do objeto
		this.price = price;
		this.quantity = quantity;
	}
	
	/*A sobrecarga se trata sobre disponibilizar mais de uma versão da mesma operação onde a diferença se encontra nos parametros*/
	
	public ProductEncapsulamento(String name, double price) {
		this.name = name; //"this", uitlizado para diferenciar atributos de variaveis locais, para acessar o dado do objeto
		this.price = price;
	}
	
	public void setName(String name) { //Metodo para conseguir acessar e alterar o atributo privado, no caso, name
		this.name = name;
	}
	
	public String getName() { //Metodo para acessar o valor do atributo "name"
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
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
