package encapsulation;

public class AirIndia {
	   private int hours;
	   private double costPerHour;
	   public AirIndia() {
		super();
	   }
	public AirIndia(int hours, double costPerHour) {
		super();
		this.hours = hours;
		this.costPerHour = costPerHour;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getCostPerHour() {
		return costPerHour;
	}
	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}
	@Override
	public String toString() {
		return "AirIndia [hours=" + this.getHours() + ", costPerHour=" + this.getCostPerHour() + "]";
	}
	   
}
