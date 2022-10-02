package constructors;

public class Product {
	public Product(int id, String name, String description, double price, int stockAmount ) {  //Her classın kendi ismiyle aynı bir constructorı vardır
		System.out.println("Yapıcı Metot çalıştı");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
	}

	public Product() {
		
	}
	int id;
	String name;
	String description;
	double price;
	int stockAmount;
}
