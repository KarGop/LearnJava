package week3.day1;

public class Calculator_Polymorphism {

	public void Add(int a, int b) {
		System.out.println("Addition of "+a+" and "+b+" : "+a+b);
	}
    public void Add(int a, int b,int c) {
    	System.out.println("Addition of "+a+" , "+b+" and "+c+" : "+a+b+c);
	}
    public void Multiply(int a, int b) {
    	System.out.println("Multiplication of "+a+" and "+b+" : "+a*b);
	}
    public void Multiply(int a, double b) {
    	System.out.println("Multiplication of "+a+" and "+b+" : "+a*b);
	}
    public void Sub(int a, int b) {
    	System.out.println("Subtraction of "+a+" and "+b+" : "+ (a-b));
	}
    public void Sub(double a, double b) {
    	System.out.println("Subtraction of "+a+" and "+b+" : "+ (a-b));
	}
    public int Div(int a, int b) {
		return a/b;
	}
    public void Div(double a, int b) {
    	System.out.println("Division of "+a+" and "+b+" : "+ (a/b));
	}
	public static void main(String[] args) {
      Calculator_Polymorphism poly = new Calculator_Polymorphism();		
      poly.Add(25, 50);  
      poly.Add(22, 33, 44);
      poly.Multiply(60, 3);
      poly.Multiply(50, 3.142857142857143);
      poly.Sub(500, 325);
      poly.Sub(22.4422, 10.11111111111);
      System.out.println("Division of 100 and 4 : "+ poly.Div(100, 4));
      poly.Div(40.8428571428, 10);
	}

}
