package ThreadsAndRecursion;

public class ThreadOutputsName implements Runnable{
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Thread " + name + " started");
	}

}
