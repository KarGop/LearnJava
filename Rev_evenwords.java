package week1.day2;

public class Rev_evenwords {

	public static void main(String[] args) {
String str ="I am a software tester"; 
System.out.println("Original sentence : "+str);
String[] strwords=str.split(" ");
String strfinal= "";
for (int i = 0; i < strwords.length; i++) {
	if(i%2!=0) {
		strfinal = strfinal + new StringBuilder(strwords[i]).reverse().toString() + " ";
	}
	else
	        strfinal = strfinal + strwords[i] + " ";
	}
	System.out.println("After reversing even words : "+strfinal);
	}
		
}