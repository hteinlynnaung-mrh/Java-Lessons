package hteinlynnaung;

class Product {
	
	private String productName;
	private double price;
	
	Product() {
		this.productName = "Unknown";
		this.price = 0.0;
	}
	
	Product(String productName) {
		this.productName = productName;
		this.price = 0.0;
	}
	
	Product(String productName, double price) {
		this.productName = productName;
		if (price < 0) {
			this.price = 0.0;
		} else {
			this.price = price;
		}
	}
	
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
	
	public double getPrice() {
		return price;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void showInfo() {
		System.out.println("Product Name : " + productName);
		System.out.println("Price : " + price);
	}

}

