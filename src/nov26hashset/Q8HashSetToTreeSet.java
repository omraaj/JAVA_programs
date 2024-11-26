package nov26hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q8HashSetToTreeSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Omraj");
		set.add("How");
		set.add("are");
		set.add("you");
		System.out.println("First hashset "+set);

		Set<String> treeset = new TreeSet<>();
		treeset.addAll(set);
		System.out.println("TreeSet :" + treeset);
		System.out.println("Type Of treeset "+treeset.getClass().getSimpleName());
	}

}
