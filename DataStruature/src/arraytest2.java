import java.util.Random;

public class arraytest2 {
	
	// Global Variable must Declare by Static
	// Reference by [Row][Column]
	
	static int[][] score = {
			{ 10, 20, 30 },
			{ 40, 50, 60 },
			{ 70, 80, 90 },
	};
	
	public static void main(String[] args)
	{
		Random rand = new Random();
		
		System.out.println(score[0][2]);
		System.out.println(score[1][0]);
		
		
	}
	
	public static void display()
	{
		
			
	}
	

}


