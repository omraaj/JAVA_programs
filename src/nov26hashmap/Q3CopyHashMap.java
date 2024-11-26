package nov26hashmap;

import java.util.HashMap;

public class Q3CopyHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(0, "Hemangi");
		hmap.put(1, "Shrads");
		hmap.put(2, "Vaibhav");
		hmap.put(3, "pranav");
		hmap.put(4, "Vaishnavi");
		hmap.put(5, "Zendaya");
		System.out.println("Original HashMap:"+hmap);
		
		HashMap<Integer, String> hmap2 = new HashMap<>();
		hmap2 = (HashMap<Integer, String>)hmap.clone();
		System.out.println("Copied/Cloned HashMap:"+hmap2);

	}

}
