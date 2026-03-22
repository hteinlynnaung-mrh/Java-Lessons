package g;

public class FindAverage {
	
	public static void main(String[] args) {
		
		int[] numbers = {12, 23, 45, 35, 67, 89};
		
		double avg, sum = 0;
		
		int length = numbers.length;
		
		for ( int num : numbers ) {
			sum += num;
		}
		
		avg = sum / length;
		
		System.out.println("Average number in the array list : " + avg);
	}

}
