package hteinlynnaung;

public class Lecturer extends AcademicStaff {
	
	private String subject;
	private int yearsOfExperience;
	
	public Lecturer(String staffName, String staffId, String faculty, double salary, String subject, int yearsOfExperience) {

		super(staffName, staffId, faculty, salary);
		this.subject = subject;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public void showLecturerInfo() {
		showAcademicStaffInfo();
		System.out.println("Subject Name       : " + subject);
		System.out.println("Years Of Experience: " + yearsOfExperience + " Years");
	}
}
