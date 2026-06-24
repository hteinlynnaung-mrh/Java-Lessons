import java.util.Scanner;

public class java10 {
    
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        
        int a = 30, b = 40, c = 50;
        
        // Find the minimum number of a, b, c
        if (a < b && a < c) 
        {    
        	System.out.println("Min number is " + a);
        }	
        else if (b < a && b < c) 
        {	
        	System.out.println("Min number is " + b);
        }
        else
        {
        	System.out.println("Min number is " + c);
        }
        
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}