package ThreadsAndRecursion;

public class RecursionDriver {

	public static void main(String[] args) {
		int[] nums = {12,11,10,9,11,13,11};
		int index = 0;
		
		RecursionPractice ex = new RecursionPractice();
		
		System.out.println(ex.count11(nums, index));

	}

}
