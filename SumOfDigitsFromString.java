package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le79af65";
		System.out.println("Given String : "+text);
		int sum =0;
		String newstr = text.replaceAll("\\D","");
		System.out.println("Digits from the string is :"+newstr);
		char[] charArray = newstr.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int num = Character.getNumericValue(charArray[i]);
			sum=sum+num;
		}
		System.out.println("Sum of digits from given string is "+sum);
	}

}
