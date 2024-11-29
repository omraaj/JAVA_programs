package nov26hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Q13CountryCapitalHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> country = new HashMap<>(10);
		Scanner sc = new Scanner(System.in);
		System.out.println("\nList of Country and Their Capital");
		System.out.println("enter country name:");
		String s1 = sc.next();
		System.out.println("Capital:");
		String s2 = sc.next();
		
			country.put(s1, s2);
		
		System.out.println(country);
		
		
		
		

	}

}
