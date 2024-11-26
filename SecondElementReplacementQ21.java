package arraylistpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondElementReplacementQ21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Hi");
		list.add("Omraj");
		list.add("How");
		list.add("are");
		list.add("you");
		System.out.println("Arraylist:"+list);
		System.out.println("Enter the element to be replaced at second");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		list.set(1, s1);
		System.out.println(list);
	}

}
