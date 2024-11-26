package nov26hashmap;

import java.util.HashMap;

public class Q2KeyValueSizeHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(0, "Omraj");
		hmap.put(1, "Ashu");
		hmap.put(2, "Salunkhe");
		hmap.put(3, "Mohit");
		hmap.put(4, "Sita");
		hmap.put(5, "Gajraj");
		System.out.println("No Of Key Value pairs is HashMap are:"+hmap.size());

	}

}
