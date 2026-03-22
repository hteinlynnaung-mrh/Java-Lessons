import java.util.Scanner;

public class javaproject13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a,b,c,d;
        System.out.println("Enter Number 1:");
        a = scanner.nextInt();
        System.out.println("Enter Number 2:");
        b = scanner.nextInt();
        System.out.println("Enter Number 3:");
        c = scanner.nextInt();
        System.out.println("Enter Number 4:");
        d = scanner.nextInt();

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

        scanner.close();
    }
}