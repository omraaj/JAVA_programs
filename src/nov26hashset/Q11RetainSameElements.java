package nov26hashset;

import java.util.HashSet;

public class Q11RetainSameElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		set1.add(7);
		set1.add(25);
		set1.add(17);
		System.out.println("Second Hashset "+set);
		set.retainAll(set1);
		System.out.println("Common elements are : " +set);
	}

}
