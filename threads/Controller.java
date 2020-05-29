package sem2week8practical;

import java.util.ArrayList;
import java.util.Arrays;

public class Controller {
	
	//a.Create a class that instantiates anArrayList of type Integer (declare it statically)
	public static ArrayList<Integer> numberList = new ArrayList<>();

	public static void main(String[] args) {
		
		//b.Populate the ArrayList with the values 1 –10 inclusive.
		// 
		//Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		populateArrayList(1,10,0);

		ControlQueue runnable = new ControlQueue();
		Thread myThread = new Thread(runnable);
		myThread.start();
		
		populateArrayList(11,20,1);
		
		System.out.println("Main thread finished");

	}
	
	/**
	 * Populates the arrayList
	 */
	
	public static void populateArrayList(int start, int end, int sleep) {
		
		for(int loop = start; loop <= end; loop++) {
			addElement(loop);
			try {
				Thread.sleep(sleep*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized static void addElement(int n) {
		numberList.add(n);
	}
	
	public synchronized static void removeElement0() {
		if(numberList.isEmpty()) {
			System.out.println("List empty");
		} else {
			numberList.remove(0);
			System.out.println(Controller.numberList.toString());
		}
	}

}
