package week1.day1;

public class Computer {
int memory = 16;
String brand = "DELL";
public void cpu (String core) {
	System.out.println("You wish to buy a..... \n\t"+brand+ " system with "+core );
}
public boolean isConvertible() {
	return false;
}
public String storage() {
	return "1TB";
}
}