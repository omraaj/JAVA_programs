package collectionutilclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(2);
		list.add(3);
		list.add(238787);
		list.add(768);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
//		Collections.rotate(list, 1);
//		System.out.println(list);
		int max =Collections.max(list);
		System.out.println(max);
		System.out.println(Collections.min(list));
		
		System.out.println(Collections.synchronizedCollection(list));
		Collections.shuffle(list);
		System.out.println(list);
	}

}
