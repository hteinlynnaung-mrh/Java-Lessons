public class Main {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Alice");
		Student s3 = new Student("Bob", 20);
		
		System.out.println(s1.name + " - " + s1.age);
		System.out.println(s2.name + " - " + s2.age);
		System.out.println(s3.name + " - " + s3.age);
	}

}
