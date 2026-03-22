package c;

public class Student extends Person {
	
	private String studentID;
	
	public Student(String name, int age, String studentID) {
		super(name, age);
		this.studentID = studentID;
	}

	public void showStudentInfo() {
		showInfo();
		System.out.println("Student ID: " + studentID);
	}
}