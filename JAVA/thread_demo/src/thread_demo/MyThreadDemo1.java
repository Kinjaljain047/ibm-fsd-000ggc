package thread_demo;

public class MyThreadDemo1 implements Runnable {
  public static void main(String[] args) {
	  MyThreadDemo1 myThread= new MyThreadDemo1();
	 ThreadDemo2 myThread2= new ThreadDemo2();
	 
	  Thread t1= new Thread(myThread);
	  Thread t2= new Thread(myThread2);
	  t1.start();
	  System.out.println(t1.isAlive());
	  
	  t2.start();
	  try {
		  t1.join();
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  System.out.println(t2.isAlive());
  }

@Override
public void run() {
	try {
	for(int i=0; i<200;i++) {
		System.out.println("=>i"+i);
		if(i==10) {
			Thread.yield();
		}
	}
	
}catch(Exception e) {
	
}
  
}
}
