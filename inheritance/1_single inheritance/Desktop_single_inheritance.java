package org.system;

public class Desktop_single_inheritance extends Computer{
    public void getdesktopSize() {
    	System.out.println("Desktop size is 60.45 cm(23.8) ");
    }
    
	
	public static void main(String[] args) {
		Desktop_single_inheritance obj = new Desktop_single_inheritance();
		obj.computerModel();
		obj.getdesktopSize();

	}

}
