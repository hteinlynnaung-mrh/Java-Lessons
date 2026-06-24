import java.util.Scanner;

public class javatest6 {
	
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int a,b,c;
		int avg;
		
		// nextInt used for get integer
		System.out.print("Enter Number 1:");
		a=scanner.nextInt();
		
		System.out.print("Enter Number 2:");
		b=scanner.nextInt();
		
		System.out.print("Enter Number 3:");
		c=scanner.nextInt();
		
		avg=(a+b+c)/3;
		
		System.out.println("Average is "+avg);
		
	}
}
