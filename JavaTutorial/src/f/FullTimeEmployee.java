package f;

class FullTimeEmployee extends Employee {
	
	protected double hourlyRate;
	protected int hours = 160;
	
	public FullTimeEmployee(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	@Override 
	double calculateWage() {
		return hourlyRate * hours;
	}

}
