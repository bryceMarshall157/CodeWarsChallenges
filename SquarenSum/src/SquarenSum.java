public class SquarenSum {
	public static int squareSum(int[] n) {
		int sum = 0;

		for (int i = 0; i < n.length; i++) {

			sum += n[i] * n[i];

		}
		return sum;
	}

	public static void main(String[] args) {

		int[] test = { 1, 2, 3 };

		System.out.println(squareSum(test));

	}
}