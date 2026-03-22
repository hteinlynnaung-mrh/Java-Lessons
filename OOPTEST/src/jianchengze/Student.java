package jianchengze;

public class Student extends Person {

	private String studentId;
	
		public Student(String name, int age, String studentId) {
			super(name, age);
			this.studentId = studentId;
		}
		
		public void showStudentInfo() {
			showInfo();
			System.out.println("Student ID: " + studentId);
		}
}
