import java.util.Arrays;

public class ReverseSequence{

  public static int[] reverse(int n){
    
    int[] revSequence = new int[n]; 
    
    for(int index=0; index<n;index++){
      
      revSequence[index] = n - index;
    
    }
    
    return revSequence;
  }
  
  public static void main(String[] args) {
	  
	  System.out.println(Arrays.toString(reverse(5)));

  }

}