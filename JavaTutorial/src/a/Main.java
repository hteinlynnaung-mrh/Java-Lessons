package a;

public class Main {
	public static void main(String[] args) {
		String name = "Htein Lynn Aung";
		int myNum = 15; 
		// when you declare final integer,that variable value will be the last value.
		// So,When you add the other number that cause the error.
		myNum = 20;
		
		String firstName = "Htein"; // Type / VariableName = Value
		String lastName = "Lynn Aung";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
		int x = 5;
		int y = 5;
		System.out.println("\nThe sum is: " + x + y); // String add
		System.out.println("The sum is: " + (x + y)); // Value add
		
		int a = 5, b = 6, c = 7;
		System.out.println("\nThe result: " + a + b + c);
		
		int d, e, f;
		d = e = f = 50;
		System.out.println("The result: " + (d + e + f));
		
		// final variables in java are usually written in upper case
		final int MINUTES_PER_HOUR = 60; 
		final int BIRTHYEAR = 1999;
		System.out.println("\nMinute Per Hour: " + MINUTES_PER_HOUR);
		System.out.println("Birth Year: " + BIRTHYEAR);
		
		System.out.println("\nHello! " + name);
		System.out.println(27);
		System.out.println(3 + 3);
		System.out.println(2 * 5);
		System.out.println(myNum);
		
		// Student Data
		String studentName = "Htein Lynn Aung";
		int studentID = 15;
		int studentAge = 23;
		float studentFee = 72.25f;
		char studentGrade = 'B';
		
		System.out.println("\nStudent Name: " + studentName);
		System.out.println("Student ID: " + studentID);
		System.out.println("Student Age: " + studentAge);
		System.out.println("Student Fee: " + studentFee);
		System.out.println("Student Grade: " + studentGrade);
		
		int length = 4;
		int width = 5;
		int area;
		
		area = length * width;
		
		System.out.println("\nLength is -> " + length);
		System.out.println("Width is -> " + width);
		System.out.println("Area of the rectangle is -> " + area);
		
		char ch = 'A';
		int ascii = ch;
		System.out.println(ascii);
		
		char myVar1 = 65, myVar2 = 66, myVar3 = 67; // Display char with ASCII 
		System.out.println(myVar1);
		System.out.println(myVar2);
		System.out.println(myVar3);
		
		String greeting = "Hello Java!";
		System.out.println(greeting);
		
		// Create variables of different data types
		int items = 50;
		float costPerItem = 9.99f;
		float totalCost = items * costPerItem;
		char currency = '$';
		
		System.out.println("\nNumber of items: " + items);
		System.out.println("Cost per item: " + costPerItem);
		System.out.println("Total cost: " + totalCost + currency);
		
		int maxScore = 500;
		int userScore = 423;
		double percentage = (double) userScore / maxScore * 100.0d;
		char percent = '%';
		
		System.out.println("\nUser's percentage is " + percentage + percent);
		
		double g = 10.0d;
		double h = 3.0d;
		System.out.println(g / h);
		
		int q = 5;
		int r = 3;
		System.out.println(q > r);
		
		String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the string is: " + text.length());
		System.out.println("The lowercase of the string is: " + text.toLowerCase());
		
		String txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("where"));
		
		String pos = "Hello";
		System.out.print(pos.charAt(1));
		System.out.println(pos.charAt(4));
		
		String remove = " Hello Java! ";
		System.out.println("Before: [" + remove + "]");
		System.out.println("After: [" + remove.trim() + "]");
		
		String name1 = "Hnin Mon Thant";
		int age = 21;
		System.out.println("Her name is " + name1 + " and I Love her so much and her age is " + age + "years old.");
		
		String j = "Love";
		String k = " is";
		String l = " sometimes dangerous!";
		String result = j.concat(k).concat(l);
		System.out.println(result);
	}
	
}
