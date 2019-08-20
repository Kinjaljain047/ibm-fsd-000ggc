package Package1;

public class Tesrer {
	public static void main(String[]args) {
		
		Outer oc= new Outer();
		oc.outerMethod();
		Outer.Inner ic= oc.new Inner();
		ic.InnerMethod();
		Outer.Inner.Inner2 ic1= oc.new Inner().new Inner2();
		ic1.Inner1Method();
	}

}
