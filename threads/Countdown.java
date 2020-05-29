package sem2week8practical;

public class Countdown implements Runnable {

	@Override
	public void run() {
		
		while (true) {
			for (int count=1000;count>=0;count--) {
				System.out.println(count);
				//Add a delay to the countdown(0.1 second) between number decrements.
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					break;				}
				
			}
		}
	}
}
