package arraylistpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PortionArrayListQ12 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(32);
		list.add(65);
		list.add(12);
		list.add(87);
		list.add(999);
		System.out.println("ArrayList :"+list);
		System.out.println("Enter the no of index to extract portion:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
	
      System.out.println(list.subList(a, b));
	}

}
