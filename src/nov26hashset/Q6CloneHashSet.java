package nov26hashset;

import java.util.HashSet;
import java.util.Set;

public class Q6CloneHashSet {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Omraj");
		set.add("How");
		set.add("are");
		set.add("you");
		System.out.println("First hashset "+set);
		HashSet<String> set2 = new HashSet<String>();
		set2 =(HashSet)set.clone();
		System.out.println("Cloned Hasset"+set2);

	}

}
