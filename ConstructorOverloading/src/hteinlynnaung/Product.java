package hteinlynnaung;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		name = "Unknown";
		price = 0.0;
		quantity = 0;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0;
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
	}
	
	public void showInfo(String title) {
		System.out.println(title);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Qantity: " + quantity);
	}

}
