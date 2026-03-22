package hteinlynnaung;

public class FoodProduct extends Product {
	
	private int expireDays;
	
	public FoodProduct(String productName, double basePrice, int quantity, int expireDays) {
		super(productName, basePrice, quantity);
		this.expireDays = expireDays;
	}

	@Override
	public double calculateFinalPrice() {
		double subtotal = subTotal();
		double discount = 0;
		
		if (expireDays <= 3) {
			discount = subtotal * 0.20;
		} else if (expireDays <= 7) {
			discount = subtotal * 0.10;
		}
		return subtotal - discount;
	}

}