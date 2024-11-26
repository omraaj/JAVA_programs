package arraylistpractice;

import java.util.ArrayList;

public class EmptyArrayListQ17 {
   
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hi");
		list.add("Hi");
		list.add("Hi");
		list.add("Hi");
		list.add("Hi");
		System.out.println("ArrayList 1 :"+list);
		list.removeAll(list);
		System.out.println("Empty array list "+list);
	}
}
