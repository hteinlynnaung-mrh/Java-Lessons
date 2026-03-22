import java.util.Scanner;
import java.util.LinkedList;

public class first {
	
	public static void main(String[] args)
	{
		// Declare LinkedList and Create LinkedList name data
		
		LinkedList<Integer> data = new LinkedList<>();
		
		// Add data to LinkedList
		data.add(10);
		data.add(20);
		
		// Add data to First List
		data.addFirst(99);
		
		// Add data to Last Element List
		data.addLast(88);
		
		// Remove First element
		data.removeFirst();
		// Remove Last element
		data.removeLast();
		
		System.out.println("Data is "+data);
		// Remove Value in LinkedList - 20
		data.remove(Integer.valueOf(20));
		
		System.out.println("Data is "+data);
		
	}

}
