package arraylistpractice;

import java.util.ArrayList;

public class TrimCapacityOfArrayListQ19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Hi");
		list.add("Omraj");
		list.add("How");
		list.add("are");
		list.add("you");
		list.trimToSize();
		System.out.println("ArrayList 1 :" +list);
		
//		System.out.println(list.size());
	
	}

}
