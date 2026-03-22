package g;

public class FindSeat {
	
	public static void main(String[] args) {
		
		String[] seates = {"Htein" , "Hnin" , "Khin", "Kyaw", "Aung"};
		
		for (int i = 0; i < seates.length; i++) {
			System.out.println("The seat " + i + " is taken by the " + seates[i]);
		}
	}

}
