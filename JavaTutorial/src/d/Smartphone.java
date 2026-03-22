package d;

class Smartphone extends ElectronicProduct {
	
	protected String  operatingSystem;
	protected int storage;
	
	public Smartphone(String productName, double price, int warrantyPeriod, String operatingSystem, int storage) {
		super(productName, price, warrantyPeriod);
		this.operatingSystem = operatingSystem;
		this.storage = storage;
	}
	
	public void showSpecs() {
		showWarranty();
		System.out.println("Operating System: " + operatingSystem);
		System.out.println("Storage: " + storage + " GB");
	}
}
