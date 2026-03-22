package b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		for ( int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("Liftoff!");
		for ( int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Hello, " + name);
		
		System.out.print("\nEnter your age: ");
		int age = scanner.nextInt();
		int yearToTurn100 = 2026 + (100 - age);
		System.out.println("You will turn 100 in the year " + yearToTurn100);
	}

}
