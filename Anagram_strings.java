package week1.day2;

import java.util.Arrays;

public class Anagram_strings {

	public static void main(String[] args) {
		String str1 ="silent";
		String str2 ="listen";
		if(str1.length()== str2.length()) {
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			if (Arrays.equals(charArray1,charArray2)) {
				System.out.println(str1 + " and "+ str2 + " are Anagram");
			}else
					System.out.println(str1 +" and "+ str2+" are not anagram");
		}
		else 
			System.out.println(str1 +" and "+ str2+" are not anagram");

	}

}
