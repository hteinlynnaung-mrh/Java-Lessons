import java.util.Scanner;

	public class javafunctiontest2 {

	    // Task 2 method
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

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Ask user for input
	        System.out.print("Enter your score: ");
	        int score = sc.nextInt();

	        // Call chkGrade and print result
	        char grade = chkGrade(score);
	        System.out.println("Your grade is: " + grade);

	        sc.close(); // close scanner
	    }
	}

