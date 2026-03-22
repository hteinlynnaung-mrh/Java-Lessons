public class javatest1 {
	
	public static void p(Object o) {
		System.out.print(0);
	}
	public static void pln(Object o) {
		System.out.println(o);
		
	}
	
	public static void main(String[] args) {
		int a;
		int age;
		
		// Integer Data Type
		// Example is 100 35 9
		
		// Floating Pint Data Type
		// Example is 36.4 3.75
		
		print_statements();
		print_tabs();
		p("\t*\n*\t\t*\n\t*\n");
		p("Hello Everyone" + " OK " + "YES\n");
		
		a = 50;
		pln("A value is " + a);
	
		age = 23;
		pln("John age is " + age);
	}
	
	public static void print_statements() {
		pln("Hello Java");
		pln("Today is Happy");
		pln("Good Luck");
	}
	
	public static void print_tabs() {
		// 1. \t for Tab space, 8 space
		// 2. \n for New Line
		p("\nA\tB\tC\nHello\nEveryone\n");
	}

}
 