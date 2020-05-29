package sem2week8practical;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Create a Threaded class ControlQueue(implements runnable)  
 * that will continually remove the first item in the ArrayList 
 * until there are no further items.Each time an item is removed 
 * the array contents should be displayed on screen.
 * @author louiserosehamerston
 *
 */

public class ControlQueue implements Runnable {

	@Override
	public void run() {
		while (Controller.numberList.size()>0) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Controller.removeElement0();
		}
		System.out.println("ControlQueue Thread finished");
	}
	

	
	
	
	/*a.Create a class that instantiates anArrayList of type Integer (declare it statically)
	 *b.Populate the ArrayList with the values 1 –10 inclusive.
	
	static Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
	static ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(nums));

	@Override
	public void run() {
		/* Continually remove the first item in the 
		 * ArrayList until there are no further items.
		 * Each time an item is removed the array contents 
		 * should be displayed on screen.
		 
		do {
			numberList.remove(0);
			System.out.println(numberList);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while(!numberList.isEmpty());
		
	}
	*/
}
