package week3.day1;

public class Students {
	//create multiple getStudentInfo() method by passing id argument alone - overloading method
	
	public int getStudentInfo(int id) {
		return id;
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Id is "+ id);
		System.out.println("Name is "+ name);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Email is "+ email);
		System.out.println("Phone number is "+ phoneNumber );
	}
	public static void main(String[] args) {
		Students obj = new Students();
		int Students = obj.getStudentInfo(1);
		obj.getStudentInfo(35, "abc");
		obj.getStudentInfo("abc35@gg.com", 12345698);
		
	}

}
