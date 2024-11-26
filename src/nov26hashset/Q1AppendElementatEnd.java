package nov26hashset;

import java.util.HashSet;
import java.util.Set;

public class Q1AppendElementatEnd {

	public static void main(String[] args) {
		
		//we can not append element at end since hashset is unordered
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Omraj");
		set.add("How");
		set.add("are");
		set.add("you");
		
		System.out.println("Given hashset"+set);
		
	}

}
