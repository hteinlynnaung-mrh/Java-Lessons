package hteinlynnaung;

import java.util.Scanner;

public class NumberAnalyzerMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[4];
		
		System.out.print("Enter number A: ");
		nums[0] = sc.nextInt();
		System.out.print("Enter number B: ");
		nums[1] = sc.nextInt();
		System.out.print("Enter number C: ");
		nums[2] = sc.nextInt();
		System.out.print("Enter number D: ");
		nums[3] = sc.nextInt();
		
		// Create object OOP
		NumberAnalyzer analyzer = new NumberAnalyzer(nums);
		
		// Call method
		analyzer.displayResult();
	}

}

