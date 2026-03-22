package hteinlynnaung;

public class NumberAnalyzer {

	private int[] nums;
	
	// Constructor
	public NumberAnalyzer(int[] numbers) {
		this.nums = numbers;
	}
	
	// Method to find maximum number using loop
	public int getMaximum() {
		int max = nums[0];
		for (int i = 0; i < 4; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}
	
	// Method to find minimum number using loop
	public int getMinimum() {
		int min = nums[0];
		for (int i = 0; i < 4; i++) {
			if (nums[i] < min) {
				min = nums[i];
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
