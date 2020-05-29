package ThreadsAndRecursion;

public class ExtendingThreadTest {

	public static void main(String[] args) {
		ExtendingThreadExample ete = new ExtendingThreadExample();
		//start the Thread
		ete.start();
		do {
			System.out.println("Main thread. Running away.....");
		} while(true);

	}

}
