import java.util.Scanner;

public class javaforloop2 {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i,a,b;
		
		
		
		for (i=0;i<=10;i=i+1)
		{
			System.out.print("*");
		}
		System.out.println(" ");
		
		a=5;
		b=20;
		for (i=a;i<=b;i=i+1)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("");
		
		for (i=b;i>=a;i=i-1)
		{
			System.out.print(i+" ");
		}
		
		
		
		for (i=a;i<=b;i=i+1)
		{
			// 20%2 = 0
			// 9%2 = 1
			//10/2 = 5 Reminder = 0
			// 4%2 = 0
			
			if (i%2==0)
			{
				System.out.println(i+" ");
			}
		}
		
		for (int x = 1; x <= 5; x++) {
            for (int k = 0; k < x; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
	}

}
