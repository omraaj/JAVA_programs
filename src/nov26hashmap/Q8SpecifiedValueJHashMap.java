package nov26hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Q8SpecifiedValueJHashMap {

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
		
		System.out.println("Enter value:");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		if (hmap.containsValue(s1)) {
			System.out.println("Contains");
		} else {
            System.out.println("Not contains");
		}
	}

}
