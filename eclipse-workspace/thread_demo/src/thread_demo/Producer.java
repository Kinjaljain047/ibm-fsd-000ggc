package thread_demo;

import java.util.*;

public class Producer implements Runnable {
	private final List<Integer> sharedQueue;
	private final int SIZE;

	public Producer(List<Integer> sharedQueue, int sIZE) {
		super();
		this.sharedQueue = sharedQueue;
		this.SIZE = sIZE;
	}

	@Override
	public void run() {
		for (int i = 0; i < 7; i++) {
			System.out.println("produced:" + i);
			try {
				produce(i);
			} catch (InterruptedException ex) {

			}

		}

	}

	private  void produce(int i) throws InterruptedException {
		synchronized(sharedQueue) {
		while (sharedQueue.size() == SIZE) {
			System.out.println(
					"Queue is full " + Thread.currentThread().getName() + " is waiting , size: " + sharedQueue.size());
			sharedQueue.wait();
		} 
		 sharedQueue.notifyAll();
			sharedQueue.add(i);
			
			
		}
	}
}
