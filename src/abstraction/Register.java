package abstraction;

public class Register extends Car{

	@Override
	void register() {
		
		System.out.println("Register from Register Class");
	}

	@Override
	void service() {
		System.out.println("Service from Register Class");
		
	}



}
