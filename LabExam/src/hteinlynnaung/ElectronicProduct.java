package hteinlynnaung;

class ElectronicProduct extends Product {
	private int warrantyYears;
	public ElectronicProduct (String productName, double basePrice, int quantity, int warrantyYears) {
		super (productName, basePrice, quantity);
		this.warrantyYears = warrantyYears;
	}
@Override
	public double calculateFinalPrice() {
		double subtotal = subTotal();
		double warrantyCost = 300 * warrantyYears * quantity;
			
		return subtotal + warrantyCost;
    }	

	public double calculateWarrantyCost() {
	    return 300 * warrantyYears * quantity;
	}
	
	public void displayProductInfo() {
	System.out.println("Name: " + productName) ;
	System.out.println("Unit Price: " + basePrice);
	System.out.println("Quantity: " + quantity);	
	System.out.println("Warranty: " + warrantyYears + " years");
	}
}
