package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Exercise1 {

	public static void main(String[] args) {

		Random rand = new Random();
		int min = 1;
		int max = 5;
		
		/**
		 * Create an array list and a linked list.
		 * Populate both lists with 10 random numbers (1-5)
		 */
		
		ArrayList<Integer> arrList = new ArrayList<>(); 
		
		for (int count=0; count<10; count++) {
			arrList.add(min + rand.nextInt(max));
		}
		
		LinkedList<Integer> linkList = new LinkedList<>();
		for (int count=0; count<10; count++) {
			linkList.add(min + rand.nextInt(max));
		}
		
		System.out.println(arrList);
		System.out.println(linkList);
		System.out.println();
		removeDuplicates(arrList, linkList);

	}
	
	public static void removeDuplicates(Collection<Integer> originalList, Collection<Integer> listToRemove) {

		//Create a new list
		List<Integer> noDupes = new LinkedList<>();
		//traverse through the first list
		for (Integer i: originalList) {
			//if the element is not present in the other list add it to new list
			if(!noDupes.contains(i)) {
				noDupes.add(i);
			}
		}
		System.out.println(noDupes);
		
	}

}
