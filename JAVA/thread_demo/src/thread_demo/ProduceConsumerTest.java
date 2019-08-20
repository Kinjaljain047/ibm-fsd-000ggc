package thread_demo;

import java.util.*;

public class ProduceConsumerTest {
public static void main(String[] args) {
	List<Integer> sharedQueue= new ArrayList<Integer>();
	int size=4;
	Thread proThread= new Thread(new Producer(sharedQueue,size),"producer");
	Thread consThread=new Thread(new Consumer(sharedQueue,size),"consumer");
	
	proThread.start();
	consThread.start();
}
}
