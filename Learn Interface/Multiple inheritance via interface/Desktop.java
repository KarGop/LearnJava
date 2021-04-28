package week3.day1;

import java.util.ArrayList;

public class Desktop implements HardWare,Software {

	@Override
	public void softwareResources() {
		System.out.println("Software Resources are ");
		System.out.println("\tOperating System : Linux");
		System.out.println("\tRAM : 12 GB");
		System.out.println("\tDisk : 500 GB");
		System.out.println("\tProcessor : Intel(R) Core(TM) i5");
	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardware Resources are ");
		ArrayList<String> hwResrc = new ArrayList<String>();
		hwResrc.add("Monitor");
		hwResrc.add("KeyBoard");
		hwResrc.add("Mouse");
		hwResrc.add("Printer");
		for (String string : hwResrc) {
			System.out.println("\t"+string);
		}
	}
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.softwareResources();
		desktop.hardwareResources();
	}

}
