
public class KataSum {
	
	public static int sumThemUp(int a,int b) {
		
		int n = b-a;
		int sum = 0;
		
		for(int i=0;i<n+1;i++) {
			sum += b-i;
			if(i == n) {
				break;
			}
			
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sumThemUp(2,7));

	}

}
