package queues;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise1 {
	
	public static void main (String[] args) throws InterruptedException {
		ArrayList<String> family = new ArrayList<>();
		family.add("Gary");
		family.add("Louise");
		family.add("Linda");
		family.add("Chris");
		family.add("Brooke");
		family.add("Jay");
		
		Queue<String> queue = new LinkedList<String>();
		queue.addAll(family);
		
		System.out.println("Queue befode de-queuing begins: " + family);
		System.out.println("Begin de-queueing. . .");
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
			Thread.sleep(1000);
		}
		System.out.println("Finished de-queuing");
		System.out.println("List after de-queuing" + family);
		System.out.println(queue);
	}

}
