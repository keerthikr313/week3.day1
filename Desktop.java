package week3.day1;


public class Desktop extends Computer {
	//single inheritance method
	public void desktopSize() {
		System.out.println("Desktop size");
	}
	public static void main(String[] args) {
		Computer obj1 = new Computer();
		Desktop obj2 = new Desktop();
		obj1.computerModel();
		obj2.desktopSize();
		
	}
}


