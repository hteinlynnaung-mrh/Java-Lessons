package hteinlynnaung;

import java.util.Scanner;

public class linearSearch {
	
	public static int linearSearch(int[] arr, int key) {
		int comparisons = 0;
		
		for (int i = 0; i < arr.length; i++) {
			comparisons++;
			if (arr[i] == key) {
				System.out.println("Found !!! and times comparsions is " + comparisons + "times");
				return i;
			}
		}
		System.out.println("Not Found !!! and times comparisons is " + comparisons + "times");
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] data = {70, 40, 90, 12, 8, 99};
		
		System.out.print("Data is ");
		for (int num : data) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.print("Enter Key : ");
		int key = scanner.nextInt();
		
		linearSearch(data, key);
		
		scanner.close();
	}
	
}
