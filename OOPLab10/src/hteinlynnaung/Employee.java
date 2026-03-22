package hteinlynnaung;

abstract class Employee {
	
	protected String name;
	protected int age;
	
	abstract double calculateWage();
	
	void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age : " + age);
		System.out.println("Wage: " + calculateWage());
	}

}
