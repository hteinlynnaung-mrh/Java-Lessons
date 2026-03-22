package hteinlynnaung;

public class Main {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setName("Alice");
		s1.setAge(20);
		s1.setGpa(3.50);
		s1.showInfo();
	
	
		Student s2 = new Student("Bob", 19);
		 
		s2.setGpa(3.00);
		s2.showInfo();
		 
		Student s3 = new Student("Charlie", 21, 3.75);
		s3.showInfo();
		
	}
}

		