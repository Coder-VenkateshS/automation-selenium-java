package capgemini_java_tutorials;

public class ConrolsInJava {

	public static void main(String[] args) {
		// For loop
		// while loop
		// do while loop
		
//		// i wanted to run and display first ten values starting from 1
//		for (int i = 1; i<=10;i++)
//			System.out.println(i);
//		
//		// loop(initialization; exit condition: iteration or increment)
//
//		int i = 1;
//		while(i<=10) { // Entry controlled
//			System.out.println(i);
//			i++;
//		}
//		i=1;
//		do { 
//			System.out.println(i);
//			i++;
//		}while(i<1); // exit controlled
//		
		
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 * */
		
		for (int i = 1; i<=5;i++)
		{
			for(int j = 1; j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
