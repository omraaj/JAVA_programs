package arraylistpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayListQ11 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(32);
		list.add(65);
		list.add(12);
		list.add(87);
		list.add(999);
		System.out.println("ArrayList :"+list);
         Collections.reverse(list);
         System.out.println(list);

	}

}
