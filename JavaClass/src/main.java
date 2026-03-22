public class main {
	public static void main(String[] args)
	{
		car x = new car();
		x.setColor("Red");
		x.setBrand("Toyota");
		x.setYear(2024);
	
		x.showInfo();
		x.showYear();
		
		
		car y = new car();
		y.setColor("Green");
		y.setBrand("Honda");
		y.setYear(2020);
		
		y.showInfo();
	
	}

}
