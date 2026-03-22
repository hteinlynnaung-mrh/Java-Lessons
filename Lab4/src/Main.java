public class Main {
	public static void main(String[] args) {
        // TASK 1 
        Product p1 = new Product();
        p1.setProductName("Notebook");
        p1.setPrice(35.0);
        p1.setQuantity(10);
        p1.showInfo();

        // TASK 2 
        p1.addStock(5);
        p1.sell(3);
        p1.showInfo();
        System.out.println("Stock Value : " + p1.getStockValue());
        System.out.println("---------------------");

        //  TASK 3 
        Product p2 = new Product();
        p2.setProductName("Pen");
        p2.setPrice(10.0);
        p2.setQuantity(20);

        System.out.println("Information of p1:");
        p1.showInfo();
        System.out.println("Information of p2:");
        p2.showInfo();

        // Task 4
        p1.setPrice(40.0);
        p1.showInfo();
        System.out.println("New stock value of p1: " + p1.getStockValue());

        // Task 5
        Product p3 = new Product();
        p3.setProductName("Stationery Set");
        p3.setPrice(p1.getStockValue() / p1.getStockValue() * p1.getStockValue());
        p3.setPrice(p1.getStockValue()); 
        
        p3.setPrice(p1.getStockValue());
        
    }
}
