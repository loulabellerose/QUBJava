package threads;


public class CountdownThread implements Runnable {

	@Override
	public void run() {
		int loop = 10;
		do {
			System.out.println(loop--);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interuppted");
		}
		}while (loop > 0);
		
		boolean sleep = true;
		
		while (sleep) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//System.out.println("Interrupted");
				sleep = false;
			}
		}
		
		loop = 1;
		do {
			System.out.println(loop++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		} while (loop <= 10);
	}
}
