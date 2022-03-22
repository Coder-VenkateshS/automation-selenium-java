package abstraction;

public class Main {
	
	public static void main(String args[]) {
		Car carRegister = new Register();
		Car carService  = new Service();
		carRegister.register();
		carRegister.service();
		
		carService.register();
		carService.service();
	}
}
