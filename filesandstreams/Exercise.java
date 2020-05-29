package filesandstreams;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Exercise {

	public static void main(String[] args) {

		Integer[] inputNumbers = new Integer[5];
		
		Scanner keyboard = new Scanner(System.in);
		
		for (int count = 0; count < inputNumbers.length; count++) {
			System.out.println("Please enter a number:");
			Integer number = new Integer(keyboard.nextInt());
			inputNumbers[count] = number;
		}
		
		Arrays.sort(inputNumbers);
		String sorted = Arrays.toString(inputNumbers);

		try {		
			File file = new File("NumberSort.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file, true);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			//bw.write(123+"");
			bw.write(sorted);
			
			bw.close();
			System.out.println("File written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
