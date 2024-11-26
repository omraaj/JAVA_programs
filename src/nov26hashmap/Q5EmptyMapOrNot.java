package nov26hashmap;

import java.util.HashMap;

public class Q5EmptyMapOrNot {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(0, "Hemangi");
		hmap.put(1, "Shrads");
		hmap.put(2, "Vaibhav");
		hmap.put(3, "pranav");
		hmap.put(4, "Vaishnavi");
		hmap.put(5, "Zendaya");
		System.out.println(hmap);
		if (hmap.isEmpty()) {
			System.out.println("Is  Empty");
		} else {
         System.out.println("Not Empty");
		}

	}

}
