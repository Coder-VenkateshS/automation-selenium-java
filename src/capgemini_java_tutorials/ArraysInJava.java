package capgemini_java_tutorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysInJava {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		int []a= {1,2,3,4,5};
		// Why you need array or what is the purpose of the array
		// To group homogenenous data we need array
		// To retreive the elements in a easy way
		
//		for(int i=0; i<5;i++)
//		System.out.println(a[i]);

		int size;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(br.readLine());
		
		int [] arr = new int[size];
		
		for (int i=0; i <arr.length;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
	for(int i=0; i<arr.length;i++)
		System.out.print(arr[i]+ " ");
	}
	
	

}
