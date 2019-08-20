package thread_demo;

public class ThreadDemo2 implements Runnable {
	
public void run() {
	try {
	for (int j=0; j<30;j++) {
		System.out.println("=>j" +j);
		if(j==10) {
			Thread.yield();
		}
	}
}catch(Exception e) {
	
}
}
}
