package hteinlynnaung;

public class Main {
	public static void main(String[] args) {
	FoodProduct f1 = new FoodProduct("Milk", 25.00, 4, 2);
	System.out.println("\nQ1 Final Price: " + f1.calculateFinalPrice());
	
	FoodProduct f2 = new FoodProduct("Bread", 30.00, 3, 6);
	System.out.println("\nQ2 Sub-Total: " + f2.subTotal());
	
	ElectronicProduct e1 = new ElectronicProduct("Headphones", 1500.00, 2, 1);
	System.out.println("\nQ3 Warranty Cost: " + e1.calculateWarrantyCost());
	
	ElectronicProduct e2 = new ElectronicProduct("Laptop", 2500.00, 1, 3);
	System.out.println("\nQ4 Product Info: ");
	e2.displayProductInfo();
	
	ElectronicProduct e3 = new ElectronicProduct("Tablet", 1200.00, 2, 2);
	System.out.println("\nQ5 Final Price: " + e3.calculateFinalPrice());

	}
}