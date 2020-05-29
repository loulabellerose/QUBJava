package threads;

import java.util.Scanner;

public class CountdownController {

	public static void main(String[] args) throws InterruptedException {
		
		CountdownThread count = new CountdownThread();
		Thread t = new Thread(count);
		t.start();
		Thread.sleep(10000);
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the letter A to get the count back up to 10: ");
		while (true) {
			String input = s.nextLine();
			if (input.equals("A")) {
				t.interrupt();
				Thread.sleep(12000);
				break;
			}
		}
		s.close();
		System.out.println("Program terminated");	
	}

}
