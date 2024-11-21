package Collection_frameWork;

import java.util.ArrayList;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(21);
		list.add(1);
		list.add(181);
		list.add(32);
		System.out.println("Given ArryaList is " + list);
		for(int i =0;i<list.size();i++) {
			for(int j=list.size()-1;j>i;j--) {
				
				if(list.get(i)>list.get(j)) {
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j,temp);
				}
			}
		}
		System.out.println("Sorted arraylist is "+list);
		
	}

}
