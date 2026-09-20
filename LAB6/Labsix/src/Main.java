public class Main {
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		Customer c2 = new Customer("Guest");
		Customer c3 = new Customer("Guset", "N/A");
		
		c1.showInfo();
		System.out.println("-------");
		c2.showInfo();
		System.out.println("-------");
		c3.showInfo();
	
        Product p1 = new Product();
        Product p2 = new Product("Unknown");
        Product p3 = new Product("Unknown", -200);

        p1.showInfo();
        System.out.println("------");
        p2.showInfo();
        System.out.println("------");
        p3.showInfo();
        
        Order o1 = new Order();
        Order o2 = new Order("N/A", "Guest", "Unknown");
        Order o3 = new Order("N/A", "Guest", "Unknown", 3);
        
        o1.showInfo();
        System.out.println("-------");
        o2.showInfo();
        System.out.println("-------");
        o3.showInfo();
        
        Product P4 = new Product("Macbook", 40000.00);

       
        System.out.println("Before price update:");
        p1.showInfo();


        double newPrice = p1.getPrice() + 20;
        p1.setPrice(newPrice);

  
        System.out.println("\nUpdated Price: " + p1.getPrice());


        System.out.println("\nAfter price update:");
        p1.showInfo();
        
  
        Customer C1 = new Customer("Htien Lynn Aung", "htienlynnaaung.1111@gmail.com");


        Product P1 = new Product("Iphone 17 pro max", 50000.00);
        

        Order O1 = new Order("O027", C1.getName(), P1.getProductName(), 3);

 
        System.out.println("Customer Info:");
        c1.showInfo();

        System.out.println("\nProduct Info:");
        p1.showInfo();

        System.out.println("\nOrder Info:");
        o1.showInfo();


        double total = p1.getPrice() * O1.getQuantity();
        System.out.println("\nTotal Price: " + total);
    }
}
