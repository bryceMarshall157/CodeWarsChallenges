//This program is 'One's to Zeroes' Challenge on CodeWars
//It consists of one method that takes a List array representing
//a binary number, converts this binary number into its integer value
//and returns the integer

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class BinaryArraytoNumber {

	//Method to convert binary array to integer and return the int
	public static int ConvertBinaryArrayToInt(List<Integer> binary) {

		int sum = 0;
		int i = binary.size() - 1;
		int count = 0;

		while (i >= 0) {
			if (binary.get(i) == 1) {
				sum += Math.pow(2, count);
			}
			count++;
			i--;
		}

		return sum;
	}

	
	public static void main(String[] args) {
		//Declare and initialize list to pass into binary conversion method above
		List<Integer> binary_0 = new ArrayList<Integer>(Arrays.asList(0, 0, 1, 1));

		//calling the method and passing in the list to be converted and printed to screen
		System.out.println(ConvertBinaryArrayToInt(binary_0));
	}

}
