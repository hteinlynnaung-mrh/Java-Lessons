package g;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] numbers = { 23, 45, 63, 78, 34, 78, 90, 45 };
		
		int max = numbers[0];
		int min = numbers[0];
		
		for ( int n : numbers) {
			
			if (n > max) {
				max = n;
			}
			
			if (n < min) {
				min = n;
			}
		}
			
			System.out.println("The Max number is : " + max);
			System.out.println("The Min number is : " + min);

	}

}
