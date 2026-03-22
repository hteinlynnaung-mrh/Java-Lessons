package f;

public class MainApp {
	
	public static void main(String[] args) {
		FullTimeEmployee a1 = new FullTimeEmployee(200);
		a1.name = "Alice";
		a1.age = 30;
		a1.showInfo();
		System.out.println("---------------------");
		
		PartTimeEmployee a2 = new PartTimeEmployee(120,100);
		a2.name = "Bob";
		a2.age = 22;
		a2.showInfo();
		System.out.println("---------------------");
		
		InternEmployee a3 = new InternEmployee(100, 60);
		a3.name = "Charlie";
		a3.age = 20;
		a3.showInfo();
		
	}

}
