class Student {
	
	private String name;
	private int age;
	private double gpa;
	
	Student() {
		this.name = "Unknown";
		this.age = 0;
		this.gpa = 0.0;
	}
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.gpa = 0.0;
	}
	
	Student(String name, int age, double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void showInfo() {
		System.out.println("Name : " + name );
		System.out.println("Age : " + age );
		System.out.println("GPA : " + gpa );
	}
}
