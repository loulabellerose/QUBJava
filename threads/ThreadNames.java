package ThreadsAndRecursion;

public class ThreadNames {

	public static void main(String[] args) {
		ThreadOutputsName nameThread = new ThreadOutputsName();
		//pass to Thread class and name it too
		Thread thread = new Thread(nameThread, "My Wee Thread");
		thread.start();

	}

}
