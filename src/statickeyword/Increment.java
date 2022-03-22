package statickeyword;

public class Increment {
	static int i=1;
	// Memory gets initalized only once throughout the entire execution
	// final int i = 1;
	public Increment() {
		this.i++;
		System.out.println(i);
	}
	
}
