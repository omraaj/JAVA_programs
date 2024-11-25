package arraylistpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArrayList {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		list.add(32);
		list.add(65);
		list.add(12);
		list.add(87);
		list.add(999);
		System.out.println("ArrayList before shuffling :"+list);
		Collections.shuffle(list);
       System.out.println("ArrayList after shuffling :"+list);
		
	}

}
