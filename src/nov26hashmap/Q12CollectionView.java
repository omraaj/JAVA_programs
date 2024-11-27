package nov26hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Q12CollectionView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(0, "Hemangi");
		hmap.put(1, "Shrads");
		hmap.put(2, "Vaibhav");
		hmap.put(3, "pranav");
		hmap.put(4, "Vaishnavi");
		hmap.put(5, null);
		System.out.println("Collection view: "+hmap.values());

		
	}

}
