public class car {
	
	// private attribute
	private String brand;
	private String color;
	private int year;
	
	// 
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void showInfo()
	{
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
	}
	
	public void showYear() 
	{
		System.out.println("Year: " + year);
	}

}