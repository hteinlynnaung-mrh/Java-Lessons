import java.util.Scanner;

public class jvatest3 {
	
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int a,b,c;
		int sum;
		double gpa;
		String  name;
		
		// nextInt used for get integer
		System.out.print("Enter A");
		a=scanner.nextInt();
		System.out.print("Enter B");
		b=scanner.nextInt();
		System.out.print("Enter C");
		c=scanner.nextInt();
		
		// nextDouble used for get double(floating point)
		System.out.print("Enter GPA");
		gpa=scanner.nextDouble();
		
		
		// nexLine used for get String or Char from users
		
		System.out.print("Enter Yourname");
		scanner.nextLine(); // Clear Before Get Variable
		name=scanner.nextLine();
		
		sum=a+b+c;
		System.out.println("a+b+c="+(a+b+c));
		System.out.println("a+b+c="+(sum));
		System.out.println("Your GPA is "+gpa);
		System.out.println("Your name is"+name);
	}
}
