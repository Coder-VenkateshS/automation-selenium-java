package encapsulation;

// Concept of Encapsulation
// Getters and Setters or Accessors and Modifiers
// private variables is encapsulated inside a public method
// Getters are used to fetch the value
// Setters are used to pass the value 
// Encapsulates the data so the data is hidden

public class Person {
	private static String name;
	private static int age;
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public static void display() {
		System.out.println(name);
		System.out.println(age);
	}
}
