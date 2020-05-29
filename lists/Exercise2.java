package lists;

import java.awt.List;
import java.util.LinkedList;

public class Exercise2 {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("I");
		linkedList.add("dream");
		linkedList.add("have");
		linkedList.add("a");
		
		System.out.println(linkedList);
		swap(linkedList,1,3);
		System.out.println(linkedList);
		swap(linkedList,1,2);
		System.out.println(linkedList);
	}
	
	public static void swap(LinkedList<String> myList, int position1, int position2) {

		String temp = myList.get(position1);
		myList.set(position1, myList.get(position2));
		myList.set(position2, temp);
	}
	
	

}
