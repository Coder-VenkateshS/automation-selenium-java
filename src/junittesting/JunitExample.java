package junittesting;

// Junit is to perform unit testing on a piece of code
// The unit test cases is a code which ensures that the program logic works as expected
// org.junit
// Types of unit testing
// Manual Testing - without any tool support you do everything manually
// Automated Testing - you use a tool to the test cases
// 
public class JunitExample {

	public static void main(String[] args) {
		

	}
	public static int findMax(int arr[]) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}

}
