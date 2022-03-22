package interfaces;

public class MainInterfaceClass {
	public static void main(String[] args) {
		BookingApp app = new BookingApp();
		app.busBook();
		app.flightBook();
		app.roomBook();
		app.trainBook();
	}
}
