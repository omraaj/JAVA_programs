package arraylistpractice;

import java.util.ArrayList;
import java.util.List;

public class SortArrayListQ8 {

	public static void main(String[] args) {
		int temp;
		
		List<Integer> list = new ArrayList<>();
		list.add(32);
		list.add(65);
		list.add(12);
		list.add(87);
		list.add(999);
		System.out.println("ArrayList before Sorting:"+list);
         
		for(int i =0;i<list.size();i++) {
			for(int j=list.size()-1;j>i;j--) {
				if(list.get(i)>list.get(j)) {
					temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println("Sorted ArrayList:"+list);
	}

}
