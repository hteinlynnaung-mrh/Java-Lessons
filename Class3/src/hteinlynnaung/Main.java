package hteinlynnaung;

public class Main {
	public static void main(String[] args)
	{
		Car x = new Car();
		x.setBrand("Toyota");
		x.setColor("Red");
		x.setYear(2024);
	
		x.showInfo();
		x.showYear();
		
		System.out.println("---------------");
		
		Car y = new Car();
		y.setBrand("Honda");
		y.setColor("Green");
		y.setYear(2020);
		
		y.showInfo();
		y.showYear();
	
	}

}