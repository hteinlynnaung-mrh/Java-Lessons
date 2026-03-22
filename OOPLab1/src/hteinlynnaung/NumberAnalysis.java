package hteinlynnaung;

import java.util.Scanner;

public class NumberAnalysis {
	
	private int[] numbers;
	private int evenCount;
	private int oddCount;
	private int sum;
	private double average;
	
	// Constructor 
	public NumberAnalysis() {
		numbers = new int[5];
	}
	
	// Input method
	public void inputNumbers() {
		Scanner sc = new Scanner(System.in);
		char name = 'A';
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter number " + name + " : ");
			numbers[i] = sc.nextInt();
			name++;
		}
	}
	
	// Process Calculations
	public void calculate() {
		for (int n : numbers) {
			sum += n;
			
			if (n % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		average = sum / 5.0;
	}
	
	// Display results
	public void displayResult() {
		System.out.println("\nEven: " + evenCount + ", Odd: " + oddCount);
		System.out.println("Sum = " + sum + ", Average = " + average);
		System.out.println("Numbers greater than average: ");
		boolean first = true;
		
		for (int n : numbers) {
			if (n > average) {
				if (!first) {
					System.out.print(" , ");
				}
				System.out.print(n);first = false;
			}
		}
	}
}
