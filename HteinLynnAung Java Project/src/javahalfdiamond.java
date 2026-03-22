import java.util.Scanner;

public class javahalfdiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();


        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j < i) { 
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

     
        for (int i = N - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j < i) { 
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
