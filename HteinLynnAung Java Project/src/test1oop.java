import java.util.Scanner;

public class test1oop {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a,b,c;
		int avg;
		
		System.out.print("Enter Student A Score :");
		a=scanner.nextInt();
		
		System.out.print("Enter Student B Score :");
		b=scanner.nextInt();
		
		System.out.print("Enter Student C Score :");
		c=scanner.nextInt();
		
		avg=(a+b+c)/3;
		
		char score;
        if (a >= b && a<= c) {
            score = 'a';
        } 
        else if (b >= a && b>= c) {
            score = 'b';
        }  
        else {
            score = 'c'; 
        }
		
        System.out.println("Average Score is :"+ avg);
		System.out.println("Highest Score is :"+ c);
		System.out.println("Lowest Score is :"+ b);
		
	}
}