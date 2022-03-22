package capgemini_java_tutorials;

import java.util.Scanner;

public class BasicJava {

	public static void main(String[] args) {

		System.out.println("Hello World");
		/* 
		 * Variables and datatypes */
		// In java we have 8 primitive datatypes
		
		int b;
		long lg = 100000;
		short sh = 1;
		float ft = 1;
		double c = 2.5;
		char ch = 'a';
		boolean bool = true;
		byte bite = 10;
		
	// To get user defined inputs in java, You can use scanner class or BufferedReader
		
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		
		System.out.println("My integer " + b);
		
		
	}

}
