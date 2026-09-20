class Order {

    private String orderId;
    private String customerName;
    private String productName;
    private int quantity;

    Order() {
        this.orderId = "N/A";
        this.customerName = "Guest";
        this.productName = "Unknown";
        this.quantity = 1;
    }

    Order(String orderId, String customerName, String productName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = 1;
    }

    Order(String orderId, String customerName, String productName, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;

        if (quantity <= 0) {
            this.quantity = 1;
        } else {
            this.quantity = quantity;
        }
    }
    
	public int getQuantity() {
		return quantity;
	}

    public void showInfo() {
        System.out.println("Order ID      : " + orderId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Product Name  : " + productName);
        System.out.println("Quantity      : " + quantity);
    }
}
