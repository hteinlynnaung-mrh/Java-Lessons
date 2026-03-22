package hteinlynnaung;

public class ElectronicProduct extends Product {
	protected int warrantyPeriod;
	
	public ElectronicProduct(String productName, double price, int warrantyPeriod) {
		super(productName, price);
		this.warrantyPeriod = warrantyPeriod;
	}
	
	public void showWarranty() {
		getDetails();
		System.out.println("Waranty Period: " + warrantyPeriod + " years");
	}

}
