package collectionsinjava;

public class User {
	private String firstName;
	private int age;
	private String mobile;
	public User() {
		super();
	}
	public User(String firstName, int age, String mobile) {
		this.firstName = firstName;
		this.age = age;
		this.mobile = mobile;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "firstName=" + firstName + ", Age=" + age + ", mobile=" + mobile + "";
	}
	
}
