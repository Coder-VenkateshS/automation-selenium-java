package interfaces;

public class BookingApp implements Booking, VehicleBooKing{

	@Override
	public void busBook() {
		
		System.out.println("Bus booking");
	}

	@Override
	public void flightBook() {
		System.out.println("Flight Booking");
		
	}

	@Override
	public void trainBook() {
		
System.out.println("Car Booking");		
	}

	@Override
	public void roomBook() {
System.out.println("Room booking");		
		
	}

}
