import java.util.Scanner;

public class test2oop {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, d, e;
        int even = 0, odd = 0, sum, average;

		System.out.print("Enter Number A :");
		a=scanner.nextInt();
		
		System.out.print("Enter Number B :");
		b=scanner.nextInt();
		
		System.out.print("Enter Number C :");
		c=scanner.nextInt();
		
		System.out.print("Enter Number D :");
		d=scanner.nextInt();
		
		System.out.print("Enter Number E :");
		e=scanner.nextInt();
		
		int[] nums = {a, b, c, d, e};

        for (int n : nums) {
            if (n % 2 == 0)
                even++;
            else
                odd++;
        }

        sum = a + b + c + d + e;
        average = sum / 5; 

        System.out.println("Even: " + even + ", Odd: " + odd);
        System.out.println("Sum = " + sum + ", Average = " + average);

        System.out.print("Numbers greater than average: ");
        for (int n : nums) {
            if (n > average)
                System.out.print(n + " ");
        }

    }
}
