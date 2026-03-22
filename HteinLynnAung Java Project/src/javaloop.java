import java.util.Scanner;

public class javaloop {
 
 public static void p(Object obj) {
  System.out.print(obj);
 }

 public static void pln(Object obj) {
  System.out.println(obj);
 }
 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner scanner = new Scanner(System.in);
  
  int choice;
  
  do
  {
	  pln("==Menu==");
	  pln("1.Print Odd Numbers Between A-B (Highest to Lowest");
	  pln("2.Print Even Numbers Between A-B (Lowest to Highest");
	  pln("3.Print Star Pattern");
	  pln("4.Exit Program");
	  pln("Enter Your Choice:");	 
	  choice=scanner.nextInt();
	  
	  if (choice==1)
	  {
		  int a,b;
		  
		  pln("Enter A:");
		  
		  a=scanner.nextInt();
		  pln("Enter B:");
		  b=scanner.nextInt();
		  while (b >= a) {
			   if (b % 2 != 0) {
			    p(" " + b);
			   }
			   b--;
			  }
		  pln("");
		  pln("Odd Numbers Between A-B");
	
	  }
	  if (choice==2)
	  {
		  int a,b;
		 
		  pln("Enter A:");
		  a=scanner.nextInt();
		  pln("Enter B:");
		  b=scanner.nextInt();
		  while (b >= a) {
			   if (b % 2 == 0) {
			    p(" " + b);
			   }
			   b--;
			  }
		  pln("Even Numbers Between A-B");
	  }
	  if (choice==3)
	  {
		  int n;
		  pln("Enter The Number:");
		  n=scanner.nextInt();
		  for (int x = 1; x <= n; x++) {
	            for (int k = 1; k <= x; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
		  pln("Star Pattern");
	  }
	  if (choice==4)
	  {
		  break;
	  }
  } while (true);
  }
}
 
