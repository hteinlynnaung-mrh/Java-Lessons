
import java.util.*;
public class myprint {
	static int maxarray=10;
	static int[] data = new int[maxarray];
	
	public static void main(String[] args) {
		
		   Scanner Sc = new Scanner(System.in); 
		   int choice;
                        int front=0;
                        int rear=0;
                       
           do {
	            System.out.println("\n===== Stack Simulation Menu =============");
	            display();
	            System.out.println("1.EnQueue");
	            System.out.println("2.DeQueue");
	            System.out.println("3.Exit");
	            System.out.print("Enter Choice: ");
	            choice=Sc.nextInt();
	            switch (choice) {
	                case 1:
	                    // Get Variables from User
	                    // Move Data to data[index]
	                    break;
	                case 2:
	            
	                    break;
	                case 3:
	                    System.out.println("Exiting..");
	                    break;
	                default:
	                    System.out.println("Invalid choice, please try again.");
	            }
	           
	            System.out.println();
	            System.out.println();
    } while (choice!=3);
	  
	
	 }
		
	    public static void display()
	    {
	    	System.out.println("DATA Set is ");	      
	    	for (int i = 0; i < maxarray; i++)
	    	{
	        	if (data[i] != 0)
	        	{ 
	        		System.out.print(data[i] + " "); 
	            }
	        	
	        }
	    	System.out.println("");	
	    }
	
	}




