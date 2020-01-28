


public class RemoveFirstLast {

	public static String removeLastCharacter(String str) {
		   String result = "";
		   result = str.substring(1, str.length() - 1);
		   return result;
		}
	
	public static void main(String[] args) {
		
		String x = "Humility";
		
		System.out.println(removeLastCharacter(x));
		
	}

}
