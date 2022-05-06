package week3.day1;

public class Student extends Department {
	
	//multilevel inheritance method
	public void studentName() {
		System.out.println("Student name");
	}
	public void studentDept() {
		System.out.println("Student department");
	}
	public void studentId() {
		System.out.println("Student ID");
	}
	public static void main(String[] args) {
	College college = new College();
	Department department = new Department();
	Student student = new Student();
	college.collegeName();
	college.collegeCode();
	college.collegeRank();
	department.deptName();
	student.studentName();
	student.studentDept();
	student.studentId();
	}
}
