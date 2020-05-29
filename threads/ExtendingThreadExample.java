package ThreadsAndRecursion;

public class ExtendingThreadExample extends Thread {
	//Inherits the start() method from the Thread class
	@Override
	public void run(){
		
		do{
			System.out.println("My first thread..... running away......");
		} while(true);
	}
}
