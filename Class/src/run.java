public class run {
	
	public static void main(String[] args)
	{
		Student s1 = new Student("Alice", 20);
		System.out.println(s1.getName() + " - " + s1.getAge());
		
		Student s2 = new Student("John",30);
		System.out.println(s2.getName() + " - " + s2.getAge());
	}

}
