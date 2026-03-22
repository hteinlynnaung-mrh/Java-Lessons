package hteinlynnaung;

public class Main {
	
	public static void main(String[] args) {
		
		Employee a1 = new FullTimeEmployee(200);
		a1.name = "Alice";
		a1.age = 30;
		a1.showInfo();
		System.out.println("\n-------");
		
		Employee a2 = new PartTimeEmployee(100, 120);
		a2.name = "Bob";
		a2.age = 22;
		a2.showInfo();
		System.out.println("\n-------");
		
		Employee a3 = new InternEmployee(50, 120);
		a3.name = "Charlie";
		a3.age = 20;
		a3.showInfo();
		
	}
}

