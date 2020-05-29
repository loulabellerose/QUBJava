package threads;

public class MultipleThreadsExample {
	
	public MultipleThreadsExample() {
		
	}

	public static void main(String[] args) {
		for (int loop = 0; loop <100; loop++) {
			ThreadOutputsName ton = new ThreadOutputsName();
			ton.number=loop;
			Thread t = new Thread(ton);
			t.start();
		}

	}

}
