package hteinlynnaung;

public class Main {
	public static void main(String[] args) {
        // TASK 1 
        Product p1 = new Product();
        p1.setProductName("Notebook");
        p1.setPrice(35.0);
        p1.setQuantity(10);
        p1.showInfo();
        System.out.println("---------------------");

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
        System.out.println("\nInformation of p2:");
        p2.showInfo();
        System.out.println("---------------------");

        // Task 4
        p1.setPrice(40.0);
        p1.showInfo();
        System.out.println("New stock value of p1: " + p1.getStockValue());
        System.out.println("---------------------");

        // Task 5
        Product p3 = new Product();
        p3.setProductName("Stationery Set");
        p3.setPrice(p1.getPrice() + p2.getPrice());
        p3.setQuantity(5);
        p3.showInfo();
        System.out.println("Information of p3: " + p3.getStockValue());
        
    }
}
