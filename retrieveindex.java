package arraylistpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class retrieveindex {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
		list.add("Samsung");
		list.add("Apple");
		list.add("HP");
		list.add("Lenovo");
		list.add("Dell");
		System.out.println(list);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Index You want to retrieve:");
		int x = sc.nextInt();
		
		System.out.println( list.get(x));
		
		

	}

}
