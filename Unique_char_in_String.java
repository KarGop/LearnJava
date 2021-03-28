package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Unique_char_in_String {

	public static void main(String[] args) {
		String str = "TESTLEAF";
		char[] charArray = str.toCharArray();
		Set<Character> unique = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if(unique.add(charArray[i])== true) {
				System.out.print(charArray[i]);
			}
		}
	}
}
