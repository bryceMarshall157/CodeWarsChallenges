
public class DescendingOrder {
	
	public static void sortDesc(final int num) {
		
		String numString = Integer.toString(num);
		
		int min = 0;
		
		for(int i=0; i<numString.length();i++) {
			char x = numString.charAt(i);
			if(x < min) {
				numString.
			}
			System.out.println(x);
			
		}
		
	}

	public static void main(String[] args) {
		
		int myNumber = 3562;
		
		System.out.println("Your re-arranged integer is ");
		sortDesc(myNumber);

	}

}
