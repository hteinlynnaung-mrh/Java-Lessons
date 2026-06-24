import java.util.Scanner;

public class javaforloop {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i,a,b;
		a=5;
		b=30;
		
		for (i=a;i<=b;i=i+1)
		{
			// 20%2 = 0
			// 9%2 = 1
			//10/2 = 5 Reminder = 0
			// 4%2 = 0
			
			if (i%2==0)
			{
				System.out.print(i +" ");
			}

			if (i%2==1)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
