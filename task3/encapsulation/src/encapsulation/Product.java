package encapsulation;

public class Product {
	private int _id;
	String _name;
	String _description;
	double _price;
	int _stockAmount;
	String kod;
	
	//getter bloğu
	public int getId() {
		return _id;
	}
	
	//setter bloğu
	public void setId(int id) {
		//this.id = id;  //bu şekilde product ın id si ve parametredeki id nin karışmaması için productların önüne '_'  gelir
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		this._price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}
	public String getKod() {   //kod için sadece get bloğu istiyorum
		return this._name.substring(0,1) + _id;
		}

}


//!!! this içerisinde bulunduğum class demek
