import java.util.Scanner;

public class java12 {
    
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Number 1: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter Number 2: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter Number 3: ");
        double num3 = scanner.nextDouble();
        
        System.out.print("Enter Number 4: ");
        double num4 = scanner.nextDouble();
        
        double max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }
        
        double min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num4 < min) {
            min = num4;
        }
        
        System.out.println("Max Number is : " + max);
        System.out.println("Min Number is :" + min);
        
        scanner.close();
    }
}
