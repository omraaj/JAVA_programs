package arraylistpractice;

import java.util.ArrayList;
import java.util.List;

public class CloneArrayListQ16 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hi");
		list.add("Hi");
		list.add("Hi");
		list.add("Hi");
		list.add("Hi");
		System.out.println("ArrayList 1 :"+list);
		
		ArrayList<String> list1 = new ArrayList<>();
		list1=(ArrayList<String>)list.clone();
		System.out.println("Clone ArrayList"+list1);

	}

}
