package arraylistpractice;

import java.util.ArrayList;
import java.util.List;

public class ThirdElementRemoveQ6 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Samsung");
		list.add("Apple");
		list.add("HP");
		list.add("Lenovo");
		list.add("Dell");
		System.out.println("ArrayList:"+list);
		System.out.println(list.remove(2));
		System.out.println("After removing third element:"+list);

	}

}
