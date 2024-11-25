package arraylistpractice;

import java.util.ArrayList;
import java.util.List;

public class CopyArrayListQ9 {
	
  public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(32);
		list.add(65);
		list.add(12);
		list.add(87);
		list.add(999);
		System.out.println("ArrayList :"+list);
		List<Integer> list2 = new ArrayList<>();
		list2.addAll(list);
		System.out.println("Copied ArrayList:"+list2);
}
}
