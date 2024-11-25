package arraylistpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstIndexQ3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Samsung");
		list.add("Apple");
		list.add("HP");
		list.add("Lenovo");
		list.add("Dell");
		System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to enter at index 1 = ");
		String element = sc.next();
//		int ele = sc.nextInt();
		list.set(0, element);
		System.out.println("List after change: "+ list);
		
	}

}
