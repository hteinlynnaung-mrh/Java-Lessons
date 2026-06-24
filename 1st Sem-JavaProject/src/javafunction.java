
public class javafunction {
	
	public static void main(String[] args)
	{
		double a;
		hello();
		System.out.println("Good Luck");
		summary(10, 20, 30);
		summary(100, 200, 300);
		star(10);
		star(5);
		a=average(10, 30, 40);
		System.out.println(a);
	}
	
	// Not Return Method
	
	public static void hello()
	{
		System.out.println("Hello Everybody");
		
	}

	public static void summary(int x,int y,int z)
	{
		int sum;
		sum=x+y+z;
		System.out.println("Sum is " +sum);
	}
	
	public static void star(int x)
	{
		int i;
		System.out.println("");
		for (i=0; i<x; i=i+1)
		{
			System.out.print(" * ");
		}
		
	}
	
	// Return Method
	
	public static double average(double x,double y,double z)
	{
		double answer;
		answer=(x+y+z);
		return(answer/3);
	}
	
}
 