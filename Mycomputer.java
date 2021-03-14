package week1.day1;

public class Mycomputer {

	public static void main(String[] args) {
		Computer ref = new Computer();
		ref.cpu("Intel Core i7");
		ref.isConvertible();
		System.out.println("\tNon convertible system");
		//Accessing methods in another class by creating another variable & accessing the variable from another class directly 
		String hdd = ref.storage(); 
		System.out.println("\tSystem with "+hdd+" Hard disk & "+ref.memory +" Memory");
		//Accessing method from another class directly
		//System.out.println(ref.storage());
	}
}
