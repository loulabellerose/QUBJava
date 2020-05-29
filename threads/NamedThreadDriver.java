package threads;

public class NamedThreadDriver {

	public static void main(String[] args) {
		ThreadOutputsName runnable = new ThreadOutputsName();
		
		Thread getStarted = new Thread(runnable, "Runnable");
		
		getStarted.start();
		
		AnotherThreadOutputsName run2 = new AnotherThreadOutputsName();
		Thread alsoStarted = new Thread (run2, "Another Runnable");
		alsoStarted.start();

	}

}
