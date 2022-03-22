package inheritance;

public class Teacher extends User {
	
	String dept;
	String subject;
	
	public Teacher(String name, int age,String dept, String subject) {
		super(name, age);
		this.dept = dept;
		this.subject = subject;		
	}
	public void userDisplay() {
		super.userDisplay();
		System.out.println(this.dept);
		System.out.println(this.subject);
		
	}

}
