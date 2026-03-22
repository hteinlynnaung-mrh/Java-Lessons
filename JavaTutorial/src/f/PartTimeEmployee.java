package f;

class PartTimeEmployee extends Employee {
	
	protected double hourlyRate;
	protected int hoursWorked;
	
	public PartTimeEmployee(double hourlyRate, int hoursWorked) {
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	double calculateWage() {
		return hourlyRate * hoursWorked;
	}

}
