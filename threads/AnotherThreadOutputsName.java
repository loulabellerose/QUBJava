package threads;

public class AnotherThreadOutputsName implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		do {
			System.out.println("Thread " + name + " is also running");
		} while (true);
	}
	
	

}
