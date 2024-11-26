package nov26hashset;


import java.util.TreeSet;

public class Q9NoLessThan7HashSet {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(3);
		set.add(2);
		set.add(67);
		set.add(55);
		set.add(17);
		System.out.println("First treeset "+set);
		
	  TreeSet<Integer> treeset = new TreeSet<>(set.headSet(7));
		System.out.println(treeset);

	}

}
