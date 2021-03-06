package junittesting;

import java.util.StringTokenizer;

public class MathsLogic {
	
	public static void main(String[] args) {
		
		MathsLogic.findMax(new int[] {1,2,4,5});
		MathsLogic.cube(4);
		MathsLogic.reverseWord("My name is venkat");
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
	public static int cube(int n) {
		return n*n*n;
	}
	public static String reverseWord(String str) {
		StringBuilder result = new StringBuilder();
		StringTokenizer tokenizer = new StringTokenizer(str," ");
		while(tokenizer.hasMoreTokens()) {
			StringBuilder sb= new StringBuilder();
			sb.append(tokenizer.nextToken());
			sb.reverse();
			result.append(sb);
			result.append(" ");
		}
		System.out.println(result);
		return result.toString();
	}
}
