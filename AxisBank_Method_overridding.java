package week3.day1;

public class AxisBank_Method_overridding extends BankInfo {
    public void deposit() {
    	System.out.println("Put deposit in Axis Bank");
    }
	public static void main(String[] args) {
		AxisBank_Method_overridding axisBank = new AxisBank_Method_overridding();
        axisBank.saving();
        axisBank.fixed();
        //calling over ride method in sub class
        axisBank.deposit();
        //Calling Override method in super class
        BankInfo bankInfo = new BankInfo();
        bankInfo.deposit();
	}

}
