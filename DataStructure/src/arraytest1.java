import java.util.Random;

public class arraytest1 {
	
	// Global Variable must Declare by Static
	
	static int maxarray = 20;
	static int data[] = new int[maxarray];
	
	public static void main(String[] args)
	{
		Random rand = new Random();
		// I will random 1-99 for every elements is array
		int i;
		for (i = 0; i < data.length; i++)
		{
			data[i] = rand.nextInt(100);
			
		}
		display();
		
		
	}
	
	public static void display()
	{
		System.out.println(" ");
		int i;
		for (i = 0; i < data.length; i++)
		{
			System.out.print(data[i]+ " ");
		}
			
	}
	

}


