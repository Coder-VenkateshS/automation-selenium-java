package collectionsinjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// TreeSet allows only Homogeneous elements

public class UserSetExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		Set<User> userSet = new LinkedHashSet<User>();
		Set<String> userSet = new TreeSet<String>();
		userSet.add("coder");
		userSet.add("hire");
		userSet.add("abc");
		userSet.add("pat");
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		for(int i=0;i<n;i++) {
//			String name =  br.readLine();
//			int age =  Integer.parseInt(br.readLine());
//			String mobile = br.readLine();
//			
//			User user = new User(name,age,mobile);
//			userSet.add(user);
//		}
		userSet.forEach((users)->System.out.println(users.toString()));
	}

}
