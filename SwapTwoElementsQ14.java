package arraylistpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SwapTwoElementsQ14 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(32);
		list.add(65);
		list.add(12);
		list.add(87);
		list.add(999);
		System.out.println("ArrayList 1 :"+list);
		System.out.println("\nEnter the index of elemnts to be swapped:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Collections.swap(list, a, b);
         System.out.println(list);
	}

}
