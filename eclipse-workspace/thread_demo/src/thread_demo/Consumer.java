package thread_demo;

import java.util.*;

public class Consumer implements Runnable {
	private final List<Integer> sharedQueue;
	private final int SIZE;

	public Consumer(List<Integer> sharedQueue, int SIZE) {
		super();
		this.sharedQueue = sharedQueue;
		this.SIZE = SIZE;
	}

	@Override
	public void run() {
		while(true)
		{		try {
		  consume();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		}
	}

	private int consume() throws InterruptedException {
		synchronized(sharedQueue) {
		while(sharedQueue.isEmpty()) {
			System.out.println(
					"Queue is empty " + Thread.currentThread().getName() + " is waiting , size: " + sharedQueue.size());

			sharedQueue.wait();
		}
		
		sharedQueue.notifyAll();
		return (Integer) sharedQueue.remove(0);

	}
	}
}
