package f;

class InternEmployee extends Employee {
	
	protected double hourlyRate;
	protected int hoursWorked;
	
	public InternEmployee(double hourlyRate, int hoursWorked) {
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	double calculateWage() {
		return hourlyRate * hoursWorked;
	}

}
