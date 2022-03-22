package strings;

// String is immutable in nature
// String builder is mutable
// toLower
// toUpper
// subString
// equalsIgnoreCase
// equals
public class StringExamples {
	public static void main(String[] args) {
	//	String name = "venky";
		StringBuilder name = new StringBuilder("venky");
		String name1 = "venky";
		String name2 = name1+name;
		name = new StringBuilder("Ragavi");
		name.equals("Ragavi"); // ==
	}
}
