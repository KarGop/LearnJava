package week1.day2;

public class Revwords {

	public static void main(String[] args) {

String name = "Amazon Development Center";
String[] revname = name.split(" ");
//System.out.println(revname.length);
for (int i = revname.length-1 ; i>=0; i--) {
	System.out.print(revname[i]+" ");
}
	}

}
