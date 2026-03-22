package oophteinlynnaung;

public class start {
	public static void main(String[] args)
	{
		System.out.println("Hello");
		
		// Object name car1
		car car1 = new car();
		car1.color = "Red";
		car1.type = "truck";
		
		// Object name car2
		car car2 = new car();
		car2.color = "Green";
		car2.type = "Sedan";
		
		// Object name
		car mercedes = new car();
		mercedes.color = "Blue";
		mercedes.type = "Luxury";
		
		System.out.println(car1.color);
		System.out.println(car2.color);
		System.out.println(mercedes.color);
		
		car1.drive();
		
		car2.drive();
		
		mercedes.drive();
				
	}

}
