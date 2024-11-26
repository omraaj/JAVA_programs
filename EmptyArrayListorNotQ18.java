package arraylistpractice;

import java.util.ArrayList;

public class EmptyArrayListorNotQ18 {

	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hi");
		list.add("Hi");
		list.add("Hi");
		list.add("Hi");
		list.add("Hi");
		System.out.println("ArrayList 1 :"+list);
	
		if (list.isEmpty()) {
			System.out.println("ArrayList is Empty");
		} else {
            System.out.println("ArrayList is not empty");
		}
	}
}
