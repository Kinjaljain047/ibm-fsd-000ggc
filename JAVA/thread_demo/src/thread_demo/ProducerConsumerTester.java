package thread_demo;

public class ProducerConsumerTester {
private static final MyStack mystack=new MyStack();

public static void main(String[] args) {
	StackProducer prod= new StackProducer(mystack);
	StackConsumer cons= new StackConsumer(mystack);
	 
	Thread prodThread= new Thread(prod);
	Thread consThread= new Thread(cons);
	
	prodThread.start();
	consThread.start();
}
}
