package Package1;

public class Outer {
  private int x;
  private int y;
  
  public Outer() {
	  super();
  }
  public Outer(int x, int y) {
	  super();
	  this.x= x;
	  this.y= y;
  }
  
  public void outerMethod() {
	  System.out.println("calling outer method:" +x+"," +y);
  }
  public  class Inner{
	  public void InnerMethod() {
		  x=10;
		  y=20;
		  outerMethod();
	  }
	  
	  public class Inner2{
		  public void Inner1Method() {
			  x=30;
			  y=40;
			  outerMethod();
			  InnerMethod();
			  outerMethod();
			  
			  
		  }
	  }
  }
}
