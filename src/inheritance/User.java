package inheritance;

public class User {
	String name;
	int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	protected void userDisplay() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
