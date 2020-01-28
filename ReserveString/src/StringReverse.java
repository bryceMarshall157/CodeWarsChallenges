
public class StringReverse {

		  public static String solution(String str) {
		    
			  char[] convert = str.toCharArray();
			  char[] reverse = new char[str.length()];
			  int x = 0;
			  
			  for(int i=str.length()-1;i>=0;i--) {
				  
				  reverse[i] = convert[x];
				  x++;
				  
			  }
			  
			  String s = new String(reverse);
			  
			  return s;

		  }
	
	public static void main(String[] args) {
		
		String x = "Love";
		
		System.out.println(x + " in reverse is " + solution("Love") + " .");
		
	}
	
}
