package nov26hashset;

import java.util.HashSet;
import java.util.Set;

public class Q5EmptyHashsetOrNot {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Omraj");
		set.add("How");
		set.add("are");
		set.add("you");
		System.out.println("Given hashset"+set);
		if (set.isEmpty()) {
			System.out.println("HashSet is Empty");
		} else {
            System.out.println("Hashset is not Empty");
		}

	}

}
