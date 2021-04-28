package week3.day1;

public class MyPhone {

	public static void main(String[] args) {
		Samsung samsung = new Samsung();
		System.out.println("OS is : "+ samsung.OS);
		System.out.println("Phone Model is : " + samsung.getModel());
		System.out.println("Phone Memory is : "+ samsung.getMemory());
		OnePlus oneplus = new OnePlus();
		System.out.println("Phone Model is : " +oneplus.getModel());
		System.out.println("Phone Memory is : " +oneplus.getMemory());
		
	}

}
