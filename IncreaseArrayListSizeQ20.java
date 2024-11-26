package arraylistpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class IncreaseArrayListSizeQ20 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Hi");
		list.add("Omraj");
		list.add("How");
		list.add("are");
		list.add("you");
		System.out.println("Arraylist:"+list);
		System.out.println("Enter the size you want to increase:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		list.ensureCapacity(a);
		
		
		

	}

}
