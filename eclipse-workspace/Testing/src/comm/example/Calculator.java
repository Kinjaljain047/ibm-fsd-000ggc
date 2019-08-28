package comm.example;

public class Calculator {
   private int x;
   private int y;
   private int result;
public Calculator() {
	super();
	this.x=x;
	this.y=y;
}
   public int addMethod(int x, int y) {
	   return x+y;
   }
   
   public int subMethod(int x, int y) {
	   return x-y;
   }
   
   public boolean greaterThan(int x,int y) {
	   if(x>y) {
		   return true;
	   }else {
		   return false;
	   }
   }
}
