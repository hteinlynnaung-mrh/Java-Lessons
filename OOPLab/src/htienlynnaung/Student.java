package htienlynnaung;

public class Student {
	String name;
	int score;
	
	// Constructor
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	
	void displayInfo() {
		System.out.println("Student: " + name + ", Score: " + score);
	}

}
