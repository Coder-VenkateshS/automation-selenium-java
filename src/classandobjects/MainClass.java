package classandobjects;

// Package in Java
// Access Modifier or Access Specifier
// public - anyone can access
// private - only I have an access
// protected - the child class that inherits can use all the methods and properties of the parent class

public class MainClass {

	public static void main(String[] args) {
		
		User user_1 = new User();
		user_1.name = "venky";
		user_1.age = 35;
		User user_2= new User("ragavi",26);
//		user_2.name="ragavi";
//		user_2.age= 26;
//		System.out.println(user_1.name);
//		System.out.println(user_1.age);
//		System.out.println(user_2.name);
//		System.out.println(user_2.age);
		user_1.userDisplay();
		user_2.userDisplay();
		
	}

}

