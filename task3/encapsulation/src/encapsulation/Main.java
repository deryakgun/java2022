package encapsulation;


public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(101);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(4);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
		
	}

}
