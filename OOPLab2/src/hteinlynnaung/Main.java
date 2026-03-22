package hteinlynnaung;

import hteinlynnaung.cat;
import hteinlynnaung.dog;

public class Main {
	public static void main(String[] args) {
		// Create a Dog object
		dog dog1 = new dog();
		dog1.name = "Buddy";
		dog1.age = 3;
		
		// Create a Cat object
		cat cat1 = new cat();
		cat1.name = "Mimi";
		cat1.color = "White";
		
		// Call methods
		System.out.println("=== Dog Information ===");
		dog1.showInfo();
		dog1.bark();
		
		System.out.println("\n=== Cat Information ===");
		cat1.showInfo();
		cat1.meow();
	}
}
