package arraylistpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateArrayListQ2 {

	
	public static void main(String[] args) {
	
      
		
		List<String> list = new ArrayList<>();
		list.add("Aakash");
		list.add("Veer");
		list.add("Sakshi");
		list.add("Pranav");
		list.add("Alan");
		list.add("Virat");
		System.out.println("\nBefore Iteration "+ list);
		
		Iterator<String> listiterator = list.iterator();
		while (listiterator.hasNext()) {
		System.out.println(" "+listiterator.next());
			
		}

}
}