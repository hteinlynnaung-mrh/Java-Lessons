
import java.util.Scanner;
public class java8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int a,b;
		int result;
		
		// nextInt used for get integer
		System.out.print("Enter A");
		a=scanner.nextInt();
		System.out.print("Enter B");
		b=scanner.nextInt();
		
		result=a+b*30;
		
		System.out.println("Result "+result+"");
	}

}
