package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicates {

	public static void main(String[] args) {
		String s = "PayPal India";
		System.out.println("Original String : "+s);
		char[] ch = s.toCharArray();
		//Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<Character>();
		//Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		//Iterate character array and add it into charSet
		for (Character eachchar : ch) {
			//if the character is already in the charSet then, add it to the dupCharSet
			if (!charSet.add(eachchar)) {
				dupCharSet.add(eachchar);
			}
		}
		//Check the dupCharSet elements and remove those in the charSet
		charSet.removeAll(dupCharSet);
		//Iterate using charSet
		System.out.println("After removing duplicate elements :"); //ylIndi
		for (Character eachCh : charSet) {
			if (eachCh!=' ') {
				System.out.print(eachCh);
			}
		}		
		}
	}
