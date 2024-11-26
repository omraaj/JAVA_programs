package nov26hashmap;

import java.util.HashMap;

public class Q4RemoveAllMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(0, "Hemangi");
		hmap.put(1, "Shrads");
		hmap.put(2, "Vaibhav");
		hmap.put(3, "pranav");
		hmap.put(4, "Vaishnavi");
		hmap.put(5, "Zendaya");
		System.out.println("Original HashMap:"+hmap);
		hmap.clear();// In map we use .clear() method to remove
		System.out.println("HashMap after removed:"+hmap);
		}

}
