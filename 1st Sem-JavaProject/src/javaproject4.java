import java.util.Scanner;

public class javaproject4 {
	
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String  Name;
		String  Surname;
		String  Email;
		
		// nexLine used for get String or Char from users
		
		System.out.println("Enter Yourname :");
		Name=scanner.nextLine();
		
		System.out.println("Enter Surrname :");
		Surname=scanner.nextLine();
		
		System.out.println("Enter Your Email :");
		Email=scanner.nextLine();
		
		System.out.println("Result is "+Surname+" "+Name);
		System.out.println("Email is "+Email);
	
		
	}
}
