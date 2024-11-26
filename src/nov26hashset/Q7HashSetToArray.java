package nov26hashset;

import java.util.Arrays;
import java.util.HashSet;

public class Q7HashSetToArray {

	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Omraj");
		set.add("How");
		set.add("are");
		set.add("you");
		System.out.println("First hashset "+set);
		//convert hashset into array of strings 
		String str[]= new  String[set.size()]; 
		//using following method we can convert hashset into array
		set.toArray(str);
		
	System.out.println("Type of str "+str.getClass().getSimpleName());
		
		//if we want to print String arrya we can use loops or Arrays.toString method 
	    //in loops elements will be printed individually and using arrys to string method all array will be printed as string

	}

}
