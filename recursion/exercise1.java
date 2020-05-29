package recursion;

public class exercise1 {
	/**
	 * Main method will call a recursive method to print an array 
	 * of char elements in reverse
	 * @param args
	 */
	public static void main(String[] args) {
		char[] someArray = {'e','s','i','u','o','l'};
		
		printCharacter(someArray);
	}
	
	public static void printCharacter(char[] array) {
		if (array.length== 1) {
				System.out.println(array[0]);
			}
		else {	
			System.out.println(array[array.length-1]);
			char[] newArray = new char[array.length-1]; 
			for(int count=0; count<array.length-1; count++) {
				newArray[count] = array[count];
			}	
			printCharacter(newArray);	
		}

	}
}
