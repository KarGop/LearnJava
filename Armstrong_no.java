package week1.day2;

public class Armstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=370;
int original= 370;
int sum=0;
while (n>0) {
	sum=sum+((n%10)*(n%10)*(n%10));
	n=n/10;
}
if (sum==original) {
	System.out.println("\nGiven number "+ original+" is an Armstrong number :) ");
}
else
	System.out.println("Given number is not an Armstrong no :( ");
	}

}
