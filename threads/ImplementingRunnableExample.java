package ThreadsAndRecursion;

public class ImplementingRunnableExample implements Runnable {
	
	@Override
	public void run() {
		do {
			System.out.println("My second thread.... running away.....");
		} while (true);
	}

}
