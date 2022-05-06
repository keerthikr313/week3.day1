package week3.day1;

public class AxisBank {
	//override method
	public void deposit() {
		System.out.println("Axis bank deposit");
	}
	public static void main(String[] args) {
		BankInfo obj1 = new BankInfo();
		AxisBank obj2 = new AxisBank();
		obj1.saving();
		obj1.fixed();
		obj1.deposit();
		obj2.deposit();
	}

}
