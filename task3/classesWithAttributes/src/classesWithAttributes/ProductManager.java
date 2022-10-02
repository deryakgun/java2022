package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		//JDBC kodları ile sonra  veri tabanına yazıcaz 
		System.out.println("Product Added!!" + product.name);
	}
	
	
}
