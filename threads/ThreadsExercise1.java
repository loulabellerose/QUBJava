package sem2week8practical;
import java.util.Scanner;

public class ThreadsExercise1 {
/*Create a class that within a main method 
 * starts another Thread(Countdown) that counts down
 * from 10000 to 1 and outputs the count to screen. 
 */
	public static void main (String[] args) {
		Countdown myCountdown = new Countdown();
		Thread myThread = new Thread(myCountdown);
		System.out.print("Enter a number to set length of delay in seconds: ");
		Scanner keyboard = new Scanner(System.in);
		int delay = keyboard.nextInt();
		myThread.start();
		//After the countdown thread starts, add a delay to the main method.
		//Configure the mainThread to accept a command line argument to set the length of delay.
			try {
				Thread.sleep(delay*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//When the mainThread awakens send an interrupt to the countdown thread to cause it to stop.
			if (myThread.isAlive()) {
				System.out.println("Interrupting countdown");
				myThread.interrupt();
			}
			keyboard.close();
		}
	
}
