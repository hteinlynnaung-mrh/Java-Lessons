package myproject;
import java.util.*;

	public class myprint {
		
		static int maxarray=10;
		static int[] data = new int[maxarray];
		static int index;
		
		
		public static void main(String[] args) {
			
			   Scanner Sc = new Scanner(System.in); 
			   int choice;
			   int value;
	   
		       do {
		            System.out.println("\n===== Stack Simulation Menu =============");
		            display();
		            System.out.println("1.Push");
		            System.out.println("2.Pop");
		            System.out.println("3.Exit");
		            System.out.print("Enter Choice: ");
		            choice=Sc.nextInt();
		            switch (choice) {
		                case 1:
		                    // Get Variables from User
		                    // Move Data to data[index]
		                	
		                	index=index+1;
		                	System.out.print("Enter Number : ");
		                	value=Sc.nextInt();
		                	data[index]=value;
		                	display();
		                    break;
		                
		                case 2:
		                	System.out.print("Pop Number is"+ data[index]);
		                	data[index]=0;
		                	index=index-1;
		                	display();
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

	
	

