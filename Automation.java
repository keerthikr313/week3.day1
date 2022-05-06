package week3.day1;

public class Automation implements Language,TestTool {

	//implement all the methods of interface and in automation class try to apply This,Super,Final keywords in the code
	final int a= 20;
	int b;

	public static void main(String[] args) {
		Automation code = new Automation();
		code.Java();
		code.Selenium();
		code.thismethod();
		
	}
	public void Java() {
		System.out.println("From java method interface language");
	}
	public void Selenium() {
		int a = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println("From selenium method interface Testtool");
	}
	public void thismethod() {
		this.b = 50;
		System.out.println(b);
	}

	}


