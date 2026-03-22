package htienlynnaung;

import java.util.Scanner;

public class NumberAnalyzer {

	private int[] numbers;
	
	// Constructor
	public NumberAnalyzer(int[] numbers) {
		this.numbers = numbers;
	}
	
	// Method to find maximum number using loop
	public int getMaximum() {
		int max = numbers[0];
		for (int i = 1; i < 4; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	// Method to find minimum number using loop
	public int getMinimum() {
		int min = numbers[0];
		for (int i = 1; i < 4; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
	
	// Display result
	public void displayResult() {
		System.out.println("\nMaximum number = " + getMaximum());
		System.out.println("Minimum number = " + getMinimum());
	}

}
