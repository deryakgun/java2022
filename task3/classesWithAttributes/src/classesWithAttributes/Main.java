package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name = "Laptop";
		product.id = 101;
		product.description = "Asus Laptop";
		product.price = 5000;
		product.stockAmount = 4;
		System.out.println(product.name);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
	}

}
