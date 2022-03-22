package abstraction;

public class Service extends Car{
	@Override
	void register() {
		
		System.out.println("Register from Service Class");
	}

	@Override
	void service() {
		System.out.println("Service from Service Class");
	}
}
