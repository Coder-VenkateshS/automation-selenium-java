package classandobjects;

//Constructor and constructor overloading
class User{
	String name;
	int age;
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public User() {
		
	}
	protected void userDisplay() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}