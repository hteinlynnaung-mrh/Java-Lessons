package hteinlynnaung;

public abstract class Product {
	
	protected String productName;
	protected double basePrice;
	protected int quantity;
	
	public Product (String productName, double basePrice, int quantity) {
		this.productName = productName;
		this.basePrice = basePrice;
		this.quantity = quantity;
	}
	
	public double subTotal() {
		return basePrice * quantity;
	}
		public abstract double calculateFinalPrice();
		
		public void showBill() {
		System.out.println("===== BILL =====");
		System.out.println("Name: " + productName) ;
		System.out.println("Unit Price: " + basePrice);
		System.out.println("Quantity: " + quantity);
		System.out.println("Subtotal: " + subTotal());
		System.out.println("Final Price: " + calculateFinalPrice());
		System.out.println("=================");
	    }
		
}
