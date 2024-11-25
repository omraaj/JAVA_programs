package arraylistpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElementQ7 {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
		list.add("Samsung");
		list.add("Apple");
		list.add("HP");
		list.add("Lenovo");
		list.add("Dell");
		System.out.println("ArrayList:"+list);
		System.out.println("Element to be searched:");
		Scanner sc = new Scanner(System.in);
		String element = sc.next();
		;

		if (list.contains(element)) {
			System.out.println( list.indexOf(element));
		}
		else {
			System.out.println("Not Found");
		}
	}

}
