package nov26hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Q10ValuefOfKey {

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
		System.out.println("Enter the key:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(hmap.get(a));
	}

}