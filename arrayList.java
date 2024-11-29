package Jashwanth.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
	public  static void main(String[] args) {
		Integer[] arr = new Integer[] {1, 5,8, 9, 2};
		ArrayList<Integer> al1 =new ArrayList<>(Arrays.asList(arr));
		 al1.add(5);//we can adding the elements
		 System.out.println(al1);
		 System.out.println(al1.size());
//		 System.out.println(al1.get(2));// retrieving of elements
//		 
//		 //deleting the elements
//		 al1.clear();//it can remove the total elements from the list
//		 al1.remove(2);//it can remove the only elements we selected.
//		 
//		 al1.containsAll(al1);//verification of elements
//		 
		 //updation of elements
		 al1.set(0, 30);
		 System.out.println(al1);	 
	}
}

/*
default capacity is 0
initial capacity is 10
it allows duplicate elements.yes
it allows null values.yes
it maintain the insertion order.yes, if follows insertion then doesn't follows sorted order.
it  maintain the sorted order .No,if follows insertion then doesn't follows sorted order

arrayList is   synchronised.No
only data is stored and retrieve the data is good


*/