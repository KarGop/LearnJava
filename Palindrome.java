package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
	//String str ="No lemon, no melon";
String str="Testset";
System.out.println("Input : "+str);
String rev ="";
//System.out.println(str.length());
for (int i = str.length()-1; i >= 0; i--) 
	rev=rev+ str.charAt(i);
System.out.println("Reverse : "+rev);
if (str.equalsIgnoreCase(rev))
	System.out.println("\n"+str+" is a palindrome!!!");
else
	System.out.println("\n"+str +" is not a Palindrome:(");
	}	
}