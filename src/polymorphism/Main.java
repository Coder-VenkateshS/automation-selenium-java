package polymorphism;

// Same class, same method name, different arguments or different datatypes
// method overloading
public class Main {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(10, 5));
		System.out.println(cal.add(11, 20, 30));
	}

}

// Different class, same name -> the child class will override the parent class method
// method overriding