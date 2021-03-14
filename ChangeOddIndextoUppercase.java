package week1.day2;

public class ChangeOddIndextoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test="changeme";
char[] t = test.toCharArray();
//System.out.println(t);
for (int i = 0; i < t.length; i++) {
	if (i%2!=0) {
		System.out.print(Character.toUpperCase(t[i]));
	} else {
System.out.print(t[i]);
	}	
}
	}
}