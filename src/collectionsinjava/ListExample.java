package collectionsinjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;


// To group multiple elements into a single unit
// used to store, retrieve, manipulate and communicate aggregate data
// collection of cards
// telephone directory
// whatsapp texts, mails
// Collections Framework
// Interfaces
// Implementations
// <T> - Generics
// List<T> 
// if i am not using generics, I can store any type of data
// List can contain duplicates
public class ListExample {

	public static void main(String[] args) throws IOException {
		
//		List itemList = new ArrayList(); // It has sequential memory
//		itemList.add(1);
//		itemList.add(2.5);
//		itemList.add("OnePlus");
		
//		System.out.println(itemList);	
		// I need to get user defined inputs for the user
		
		int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
//		List<User> listOfUsers_1 = new LinkedList<User>();
//		List<User> listOfUsers_2 = new ArrayList<User>();
//		List<User> listOfUsers_3 = new Vector<User>();
		Stack<User> listOfUsers_4 = new Stack<User>();
		User user;
		
		try {
		for(int i=0;i<n;i++)
		{
			String name = br.readLine();
			int age = Integer.parseInt(br.readLine());
			String mobile = br.readLine();
			user = new User(name, age, mobile);
//			user.setFirstName(name);
//			user.setAge(age);
//			user.setMobile(mobile);
			
//			listOfUsers_1.add(user);
//			listOfUsers_2.add(user);
//			listOfUsers_3.add(user);
			listOfUsers_4.push(user);
			
		}
		}catch (Exception e) {
			throw e;
		}
//		listOfUsers.add(new User("Venky",35, "9600511879"));
//		listOfUsers.add(new User("Ragavi",26, "9600511879"));
//		listOfUsers.add(new User("Nakshathraa",1, "9600511879"));
//		listOfUsers.add(new User("Iamneo",5, "9600511879"));
//		listOfUsers.add(new User("NeoCoder",2, "9600511879"));
//		for(User users:listOfUsers_1) {
//			System.out.println(users.toString());
//		}
		// Lambda or functional interfaces
//		listOfUsers_1.forEach((users)->System.out.println(users.toString()));
//		listOfUsers_2.forEach((users)->System.out.println(users.toString()));
//		listOfUsers_3.forEach((users)->System.out.println(users.toString()));
		listOfUsers_4.forEach((users)->System.out.println(users.toString()));
	}

}
