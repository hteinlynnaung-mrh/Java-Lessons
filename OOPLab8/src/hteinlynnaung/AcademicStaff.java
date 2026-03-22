package hteinlynnaung;

public class AcademicStaff extends Staff {
	
	protected String faculty;
	protected double salary;
	
	public AcademicStaff(String staffName, String staffId, String faculty, double salary) {

		super(staffName, staffId);
		this.faculty = faculty;
		this.salary = salary;
	}
	
	public void showAcademicStaffInfo() {
		showStaffInfo();
		System.out.println("Faculty   : " + faculty);
		System.out.println("Salary    : " + salary);
	}
}
		
	
