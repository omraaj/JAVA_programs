package nov26hashset;

import java.util.HashSet;
import java.util.Set;

public class Q3NoOfElementsHashSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Omraj");
		set.add("How");
		set.add("are");
		set.add("you");
		System.out.println("Given hashset"+set);
		
		System.out.println("number of elemnts in hashset are:"+set.size());

	}

}
