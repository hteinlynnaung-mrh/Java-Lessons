import java.util.Scanner;

public class javaforloop1 {
    
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
	System.out.print("Enter Your Number : ");
	int number = scanner.nextInt();
	
	for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            	System.out.println();
        }
    }
}