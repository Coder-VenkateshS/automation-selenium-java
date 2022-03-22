package collectionsinjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
// Set does not contain duplicates

public class SetExample {

	public static void main(String[] args) {
	
				Set<String> nameSet = new HashSet<String>();
				nameSet.add("Rama");
				nameSet.add("Anusha");
				nameSet.add("Anusha");
				nameSet.add("Anusha");
				nameSet.add("Rama");
				// Iterator
				
//				Iterator<String> itr = nameSet.iterator();
//				while(itr.hasNext()) {
//					System.out.println(itr.next());
//				}
			
				for(String names: nameSet) {
					System.out.println(names);
				}
				
			}

}
