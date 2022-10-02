package constructors;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1, "Laptop", "Asus Laptop ", 10000, 5);
		
		//Parametresiz Constructor kullanım :
//		Product product = new Product();
//		product.id = 1;
//		product.name = "Laptop";
//		product.description = "Lenovo Ideapad";
//		product.price = 10000;
//		product.stockAmount = 5;
//		
						
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}

}
