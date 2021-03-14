package week1.day2;

import java.util.Arrays;

public class Duplicate_array {
	public static void main(String[] args) {
		//Get smallest duplicate number in an array
int[] numbers= {2,5,3,7,2,7,2,1};
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));
for (int i = 0; i < numbers.length; i++) {
	if(numbers[i] == numbers[i+1]) {
		System.out.println("Smallest duplicate number is :"+numbers[i]);
		break;
	}
}
	}
}