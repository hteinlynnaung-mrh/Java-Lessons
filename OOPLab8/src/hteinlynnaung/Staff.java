package hteinlynnaung;

public class Staff {
	protected String staffName;
	protected String staffId;
	
	public Staff(String staffName, String staffId) {
		this.staffName = staffName;
		this.staffId = staffId;
	}
	
	public void showStaffInfo() {
		System.out.println("Staff Name: " + staffName);
		System.out.println("Staff ID  : " + staffId);
	}
}
