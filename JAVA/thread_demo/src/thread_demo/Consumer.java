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
		try {
		  consume();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private synchronized int consume() throws InterruptedException {
		if (sharedQueue.isEmpty()) {
			System.out.println(
					"Queue is empty " + Thread.currentThread().getName() + " is waiting , size: " + sharedQueue.size());

			wait();
		}
		return (Integer) sharedQueue.remove(0);

	}
}
