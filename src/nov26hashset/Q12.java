package nov26hashset;

import java.util.HashSet;

public class Q12 {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		set.add(3);
		set.add(2);
		set.add(67);
		set.add(55);
		set.add(17);
		System.out.println("First Hashset "+set);
		set.removeAll(set);
		System.out.println("Removed elements from set:"+set);

	}

}
