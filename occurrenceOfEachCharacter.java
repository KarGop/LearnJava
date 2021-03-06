package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class occurrenceOfEachCharacter {

	public static void characterCount(String s){
		System.out.println("String is "+ s);
		String str = s.toLowerCase().replaceAll("\\s+", ""); // No need count white spaces
		//Converting given string to char array
		char[] array = str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		// Iterate over the char array
		for (int i = 0; i < array.length; i++) {
			//Check whether the Map contains the Character & If it contains then increment the key (+1)
			if (map.containsKey(str.charAt(i))) {
				int count = map.get(str.charAt(i));
	            map.put(str.charAt(i), ++count);
	         } else {
	        	 //Add the character in the map & set the value as 1
	            map.put(str.charAt(i),1);
	         }
	      }
		  //Print the Map
	      System.out.println(map);
		}
	public static void main(String[] args) {
		characterCount("Hello World!"); //{!=1, r=1, d=1, e=1, w=1, h=1, l=3, o=2}
		characterCount("welcome to Selenium automation");  //{a=2, c=1, s=1, t=3, e=4, u=2, w=1, i=2, l=2, m=3, n=2, o=4}
	}
	}	
