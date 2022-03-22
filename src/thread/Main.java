package thread;
import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
	Thread tEven = new Thread(new MyRunnable(true));
	tEven.start();
	Thread tOdd = new Thread(new MyRunnable(false));
	tOdd.start();
	}
}

