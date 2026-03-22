package d;

class Product {
	
	protected String productName;
	protected double price;
	
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}
	
	public void getDetails() {
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price + " Bhat");
	}

}
