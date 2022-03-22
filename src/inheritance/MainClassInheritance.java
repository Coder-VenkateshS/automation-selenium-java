package inheritance;

public class MainClassInheritance {

	public static void main(String[] args) {
		Student student = new Student("venky",35,"cse",2007);
		Teacher teacher = new Teacher("ragavi",26,"cse", "Java");
		student.userDisplay();
		teacher.userDisplay();
	}
}
