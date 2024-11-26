package nov26hashset;

import java.util.HashSet;
import java.util.Set;

public class Q4EmptyHasSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Omraj");
		set.add("How");
		set.add("are");
		set.add("you");
		System.out.println("Given hashset"+set);
		set.removeAll(set);
		System.out.println("Emptty hashset: " +set);
	}

}
