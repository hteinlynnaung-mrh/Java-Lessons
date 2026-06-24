import java.util.Scanner;

public class javafunctiontask1 {


    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }


    public static char chkGrade(int score) {
        if (score < 50) {
            return 'F';
        } else if (score < 60) {
            return 'D';
        } else if (score < 70) {
            return 'C';
        } else if (score < 80) {
            return 'B';
        } else {
            return 'A';
        }
    }



    public static void Pstar(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
      
        System.out.println("Power(5,3) = " + power(5, 3)); 
        
        {
        	System.out.println("Star Pattern Decreasing");
        	Pstar(5);
        }

 
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your score: ");
	        int score = sc.nextInt();

	        char grade = chkGrade(score);
	        System.out.println("Your grade is: " + grade);

	        sc.close(); 
	    }
       
    }
