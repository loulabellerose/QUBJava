/**
 * 
 */
package recursion;
import java.util.Scanner;

/**
 * @author louiserosehamerston
 *
 */
public class RecursionExercise {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome");
		boolean valid = false;
		int num;
		do { 
			System.out.println("Please enter a number between 1 and 10");
			num = keyboard.nextInt();
			if (num > 0 && num < 11) {
				valid = true;
				System.out.println("Number OK");
			}
		}while (!valid);
		
		count(num);
	}
	
	/**
	 * Recursion method takes in value from user and prints all numbers to 100
	 * @param num integer value
	 */
	public static void count(int num) {
		if (num > 100) {
			System.out.println();
		}
		else {
			System.out.println(num);
			count(num + 1);
		}
	}

}
