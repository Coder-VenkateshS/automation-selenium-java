package encapsulation;

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("venky");
		person.setAge(35);
		AirIndia airIndia = new AirIndia();
		airIndia.setHours(1000);
		airIndia.setCostPerHour(2563.85);
		System.out.println(person.toString());
		System.out.println(airIndia.toString());
		Person.display();
	  
	}

}
