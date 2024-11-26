package arraylistpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintAllElementsQ22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Hi");
		list.add("Omraj");
		list.add("How");
		list.add("are");
		list.add("you");
		System.out.println("Arraylist:"+list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
