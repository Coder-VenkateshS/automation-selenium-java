package abstraction;
// abstract class is a class for which you cannot create objects 
// We need to use a keyword called as abstract to create abstract class
// the abstract class can have abstract methods(methods without a body)
// You can also have non abstract methods
// Even if there is one abstract method, you should make the class as abstract
// you can create objects of its sub class 
// Using abstract classes you can achieve 100% abstraction
// Yes you can have both default and parameterized constuctor
// you can also have final and static methods
// This gives you a guideline

public abstract class Car {

	abstract void register();
	abstract void service();
	
	public final void run() {
		System.out.println("The car can run");
	}
}
