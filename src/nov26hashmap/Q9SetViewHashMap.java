package nov26hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q9SetViewHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(0, "Hemangi");
		hmap.put(1, "Shrads");
		hmap.put(2, "Vaibhav");
		hmap.put(3, "pranav");
		hmap.put(4, "Vaishnavi");
		hmap.put(5, null);
		System.out.println(hmap);
		Set<Map.Entry<Integer, String>> set = new HashSet<>();
		set =hmap.entrySet();
		System.out.println(set);
	}

}
