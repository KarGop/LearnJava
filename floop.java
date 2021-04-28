package week1.day2;

public class floop {
public static void main(String[] args) {
//calling method within a class
floop t= new floop();
 t.even(51);
}

public void even (int max) {
for (int i = 1; i<max; i++) {
	if (i%2==0) {
		System.out.println(i);
	}
	}}

}