package inheritance;

public class Student extends User {
	String dept;
	int year;
		
	public Student(String name, int age, String dept, int year) {
		super(name, age);
		this.dept = dept;
		this.year = year;
	}

	public void userDisplay() {
		super.userDisplay();
		System.out.println(this.dept);
		System.out.println(this.year);
	}
	
}
