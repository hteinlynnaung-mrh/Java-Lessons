import java.util.Scanner;

public class java_loop {
 
 public static void p(Object obj) {
  System.out.print(obj);
 }

 public static void pln(Object obj) {
  System.out.println(obj);
 }
 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner scanner = new Scanner(System.in);
  
  int a;
  a = 1;
  
  for (int i = 0; i < 10; i++) {
   p(" * ");
  }
  
  pln("");
  
  while (a <= 10) {
   p(" * ");
   a++;
  }
  
  pln("");
  a = 1;
  int b = 20;
  while (a <= b) {
   p(" " + a);
   a += 10;
  }
  
  pln("");
  a = 1;
  while (b >= a) {
   if (b % 2 != 0) {
    p(" " + b);
   }
   b--;
  }
  
  pln("");
  b =20;
  while (b >= a) {
   if (b % 2 == 0) {
    p(" " + b);
   }
   b--;
  }
  
  pln("");
  b = 20;
  do {
	  p(" "+a);
	  a=a+1;
  } while (a<=b);
  
  int choice;
  
  do
  {
	  pln("==Menu==");
	  pln("1.Say Hello");
	  pln("2.Say Goodbye");
	  pln("3.Exit");
	  pln("Enter Your Choice:");
	  choice=scanner.nextInt();
	  
	  if (choice==1)
	  {
		  pln("Hello");
	  }
	  if (choice==2)
	  {
		  pln("Goodbye");
	  }
	  if (choice==3)
	  {
		  break;
	  }
  } while (true);
  }
}
 
