package ThreadsAndRecursion;

public class ImplementingRunnableTest {

	public static void main(String[] args) {
		//creating the class with the run method
		ImplementingRunnableExample ire = new ImplementingRunnableExample();
		
		//pass the run class into a Thread class
		Thread newThread = new Thread(ire);
		//start the Thread via the newThread class
		newThread.start();
		do {
			System.out.println("Main thread. Running away....");
		} while (true);

	}

}
