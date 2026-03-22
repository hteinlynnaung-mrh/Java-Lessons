import java.util.Random;

public class arraytest3 {
	
	// Global Variable must Declare by Static
	// Reference by [Row][Column]
	
	static int[][] score = {
			{ 10, 20, 30 },
			{ 40, 50, 60 },
			{ 70, 80, 90 },
	};
	
	static int row = 5;
	static int col = 6;
	static int[][] data = new int[row][col];
	
	public static void main(String[] args)
	{
		Random rand = new Random();
		
		int i;
		for (i = 0; i < data.length; i++) {
			for (int x = 0; x < col; x++) {
				data[i][x] = rand.nextInt(1,100);
				
			}
				
		}
		display();
	
	}
	
	public static void display()
	{
		for (int i = 0; i < data.length; i++) {
			for (int x = 0; x < col; x++) {
				
				System.out.print(" " + data[i][x]);
			}
			System.out.println(" ");
		}
			
	}
	
}



	