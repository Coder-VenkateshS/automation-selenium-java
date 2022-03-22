package collectionsinjava;

import java.util.TreeMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, User> userMap = new TreeMap<Integer,User>(); 
		userMap.put(1,new User("venkat",35,"123"));
		userMap.put(2,new User("ragavi",26,"123654"));
		userMap.put(3,new User("Nakshathraa",9,"1234"));
		// Only from core java 8 you have functional interfaces and Lambdas
		userMap.forEach((k,value)->System.out.println("Integer value "+ k+ "Names "+ value));
	}

}
