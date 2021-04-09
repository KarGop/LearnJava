package week3.day2;

import java.util.Arrays;
import java.util.Collections;

public class revStringArray {

	public static void main(String[] args) {
		//Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		//get the length of the array	
		System.out.println("Length of the String array : "+ input.length);
		//sort the array in descending order
		Arrays.sort(input,Collections.reverseOrder());
		//prints the sorted string array in descending order 
		System.out.println(Arrays.toString(input));
		//Iterate it in the reverse order and print the array
		
		//for (int i = (input.length)-1; i >= 0; i--) {
			//System.out.println(input[i]);
		//}
		
	}
}