package comm.example.client;

public class Electronics extends Product {

	private int mfy;
	 public Electronics() {
		 super();
	 }
	 public Electronics(int mfy) {
		 super(3000);
		 this.mfy=mfy;
		 System.out.println(mfy);
	 }
}
