package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



// Exception
//  Throwable
// Arithmatic exception /0 - infinity
// Try catch block 
// finally 
// try is a keyword to execute a block of statement
// catch is used to catch an exception after trying
// throw is a keyword used to throw a user defined exception
// throws is a keyword used to throw a pre-defined exception
// finally will execute even if the system crashes or the server crashes

public class ExceptionExample {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		try {
		a = Integer.parseInt(br.readLine());
			System.out.println(a);
		}catch (NumberFormatException nfe){
			System.out.println(nfe);
		}catch (IOException ie) {
			System.out.println(ie);
		}finally {
			System.out.println("This should not execute");
		}
		int name;
		try {
			name =  Integer.parseInt(br.readLine());
			System.out.println(name);
		}catch (NumberFormatException nfe){
			throw nfe;
		}catch (IOException ie) {
			System.out.println(ie);
		}finally {
			System.out.println("I am inside finally block");
		}
	}

}
