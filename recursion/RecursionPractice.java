package ThreadsAndRecursion;

import java.lang.reflect.Array;

public class RecursionPractice {
	

	int count = 0;
	
	public int count11(int[] nums, int index) {
		if (nums.length==1  ) {
			return 1;
		}
		else {		
			if (nums[index]==11) {
				int[] array11 = new int[nums.length-1];	
				
			}
			index++;
		}
		count11(nums, index);
		return count;
	}

}
