package recursion;

public class exercise2 {

	public static void main(String[] args) {
		int number = 5;
		int x = 3;
		
		System.out.println(number + " to the power of " + x);
		
		printRecursive(number, x);
		
		System.out.println(recursive(number, x));

	}
	
	/**
	 * Recursive method to calculate the nth positive integer
	 * to the power of x
	 */
	public static int recursive(int number, int x) {
		if (x==1) {
			return number;
		}
		else {
			x--;
			return number*recursive(number, x);
		}
	}
	
	public static void printRecursive(int number, int x) {
		if (x==1) {
			System.out.print(number + " = ");
		}
		else {
			System.out.print(number + " x ");
			x--;
			printRecursive(number, x);
		}
	}

}
