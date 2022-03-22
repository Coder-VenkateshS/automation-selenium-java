package polymorphism;

// Overloading in java
public class Calculator {
	int a;
	int b; 
	int c;
	
	public int add(int a, int b)
	{
		return a+b;
	}
	public int add(int a, int b,int c)
	{
		return a+b+c;
	}
}
