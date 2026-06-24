package hteinlynnaung;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid; 
            } 
            else if (arr[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];


        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        System.out.print("Enter value to search: ");
        int target = scanner.nextInt();

        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Value found at index: " + result);
        } else {
            System.out.println("Value not found.");
        }

        scanner.close();
    }
}
