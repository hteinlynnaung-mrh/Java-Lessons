import java.util.Scanner;

public class javaforloop12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter A: ");
        int a = scanner.nextInt();
        System.out.print("Enter B: ");
        int b = scanner.nextInt();
        
        if (a <= b) {
            System.out.println("A must be greater than B");
   
        }
        
            System.out.println("Odd numbers from " + a + " to " + b + ":");
            	for (int i = a; i >= b; i--) {
            		if (i % 2 != 0) { 
                System.out.print(i + " ");
            }
       
        scanner.close();
        }
    }
}