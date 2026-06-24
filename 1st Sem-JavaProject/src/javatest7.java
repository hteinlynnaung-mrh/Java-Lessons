import java.util.Scanner;

public class javatest7 {
	
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int A,B;
		int Result;
		
	    // nextInt used for get integer
		System.out.print("Enter Number A:");
		A=scanner.nextInt();
		
		System.out.print("Enter Number B:");
		B=scanner.nextInt();
		
		
		Result=(A+B);
		Result=(A-B);
		Result=(A*B);
		Result=(A/B);
        System.out.println("Result 1 is "+(A+B)+" ");
        System.out.println("Result 2 is "+(A-B)+" ");
        System.out.println("Result 3 is "+(A*B)+" ");
        System.out.println("Result 4 is "+(A/B)+" ");
		
	}
		
	

}
