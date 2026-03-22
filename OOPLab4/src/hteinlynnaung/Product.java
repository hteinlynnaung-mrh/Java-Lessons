package hteinlynnaung;

public class Product {
	
	private String productName;
	private double price;
	private int quantity;
	
	public void setProductName(String name) {
		productName = name;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public void setQuantity(int q) {
		quantity = q;
	}
	
	public void addStock(int amount) {
		quantity = quantity + amount;
	}
	
	public void sell(int amount) {
		quantity = quantity - amount;
	}
	
	public double getStockValue() {
		return  price * quantity;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void showInfo() {
		System.out.println("Product Name : " +productName);
		System.out.println("Price        : " + price);
		System.out.println("Quantity     : " + quantity);
	}

}
