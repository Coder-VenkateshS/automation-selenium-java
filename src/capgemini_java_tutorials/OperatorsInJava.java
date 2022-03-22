package capgemini_java_tutorials;

public class OperatorsInJava {

	public static void main(String[] args) {
		
		// Operators in Java
		/*Arithmetic operators*/
		
		int a = 10;
		int b = 15;
		boolean bool = false;
//		System.out.println(a+b); // addition
//		System.out.println(a-b); // subraction
//		System.out.println(b/a); // division gives the quotient
//		System.out.println(a*b); // multiplication
//		System.out.println(b%a); // modulo gives the reminder
		
		/* Relation operator*/
		// >
		// >=
		// <
		// <=
		// != 
		// == 
		
		
		int value = (a<b)?a:b;
//		if(a<b)
//			value = a;
//		else 
//			value = b;
		System.out.println(value);
		
		/*Logical Operators*/
		// && --> more than one condition
		// || --> either this or that
		// ! --> 
		
		if(!bool)
			System.out.println(b);
		
//		Bitwise operators -> memory optimization
		
		// & - Bitwise AND
		// | - Bitwise Or
		// ~ - Negation
		// ^ - Exor
			
		
	}

}
