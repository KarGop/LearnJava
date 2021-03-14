package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range=8;
int firstnum=0,secnum=1;
int sum;
System.out.print("Fibonacci series for a range "+range+" is given below :\n"+firstnum+","+secnum);
for (int i = 2; i < 8; i++) {
	sum=firstnum+secnum;
	System.out.print(","+sum);
	firstnum=secnum;
	secnum=sum;
}
	}

}
