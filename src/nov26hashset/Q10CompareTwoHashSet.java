package nov26hashset;

import java.util.HashSet;
//import java.util.TreeSet;

public class Q10CompareTwoHashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(3);
		set.add(2);
		set.add(67);
		set.add(55);
		set.add(17);
		System.out.println("First Hashset "+set);

		HashSet<Integer> set1 = new HashSet<>();
		set1.add(3);
		set1.add(2);
		set1.add(67);
		set1.add(55);
		set1.add(17);
		System.out.println("Second Hashset "+set);
		if (set.equals(set1)) {
			System.out.println("HashSet are equal");
		} else {
              System.out.println("Hashset are not equal");
		}
	}

}
