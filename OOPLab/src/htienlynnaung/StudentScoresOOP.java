package htienlynnaung;

public class StudentScoresOOP {

	public static void main(String[] args) {
		
		// Create student objects
		Student s1 = new Student("A", 85);
		Student s2 = new Student("B", 70);
		Student s3 = new Student("C", 90);
		Student s4 = new Student("D", 60);
		
		s1.displayInfo();
		s2.displayInfo();
		s3.displayInfo();
		s4.displayInfo();
		
		double average = (s1.score + s2.score + s3.score + s4.score) / 3.0;
		
		int highest = Math.max(s1.score, Math.max(s2.score, Math.max(s3.score, s4.score)));
		int lowest =  Math.min(s1.score, Math.min(s2.score, Math.min(s3.score, s4.score)));
		
		System.out.println("\nAverage Score = " + average);
		System.out.println("Highest Score = " + highest);
		System.out.println("Lowest Score = " + lowest);
	}

}
