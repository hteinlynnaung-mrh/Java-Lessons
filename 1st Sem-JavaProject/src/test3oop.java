import java.util.Scanner;

public class test3oop {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a,b,c,d;
		
		System.out.print("Enter Number A :");
		a=scanner.nextInt();
		
		System.out.print("Enter Number B :");
		b=scanner.nextInt();
		
		System.out.print("Enter Number C :");
		c=scanner.nextInt();
		
		System.out.print("Enter Number D :");
		d=scanner.nextInt();
		
		int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        System.out.println("The maximum number is: " + max);

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        System.out.println("The minimum number is: " + min);
        
	}
}