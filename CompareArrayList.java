package arraylistpractice;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(32);
		list.add(65);
		list.add(12);
		list.add(87);
		list.add(999);
		System.out.println("ArrayList 1 :"+list);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(23);
		list1.add(69);
		list1.add(77);
		list1.add(54);
		list1.add(129);
		System.out.println("ArrayList 2 :"+list1);
		
		if (list.equals(list1)) {
			System.out.println("ArrayList are Equal");
		} else {
            System.out.println("ArrayList are not Equal");
		}
	}

}