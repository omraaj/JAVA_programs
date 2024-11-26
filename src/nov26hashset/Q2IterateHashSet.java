package nov26hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q2IterateHashSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Omraj");
		set.add("How");
		set.add("are");
		set.add("you");
		System.out.println("Given hashset"+set);
		Iterator<String> itr =set.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
