package hteinlynnaung;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product();
        p1.showInfo();

        System.out.println("--------------------");

        Product p2 = new Product("Pen", 10.0);
        p2.showInfo("Product Information");

        System.out.println("--------------------");

        Product p3 = new Product("Notebook", 35.0, 20);
        p3.showInfo();
        
        System.out.println("--------------------");
        
        Product p4 = new Product("Bag", 250.0, 5);
        p4.showInfo();
        
        System.out.println("--------------------");
        
        Product p5 = new Product("Shoes", 1200.0);
        p5.showInfo();
        
        System.out.println("--------------------");
        
        p5.showInfo("Product Information");
        
    }
}

