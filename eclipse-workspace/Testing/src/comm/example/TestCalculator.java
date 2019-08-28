package comm.example;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

 public class TestCalculator extends TestCase {

	int x;
	int y;
	
	
	
	
	public TestCalculator() {
		super();
	}

	//public TestCalculator(String name) {
	//	super(name);
	//}

	@Test
	public void testaddMethod() {
	Calculator c= new Calculator();
		int x=10;
		int y=20;
		int result=c.addMethod(x, y);
		assertEquals(30,result);
	}
	
	@Test
	public void testsubMethod() {
		Calculator c= new Calculator();
		int x=10;
		int y=20;
		int result=c.subMethod(x, y);
		assertEquals(-10,result);
	}
	@Test
	public void testgreaterThan() {
	Calculator c= new Calculator();
		int x=10;
		int y=20;
		boolean result=c.greaterThan(x, y);
		assertEquals(false,result);
	}
	
	public static TestSuite createTestSuite() {
		TestSuite testsuite= new TestSuite("All test");
		testsuite.addTest(new TestCalculator());
		testsuite.addTest(new TestCalculator());
		testsuite.addTest(new TestCalculator());
		return testsuite;
	}
	public static void main(String[] args) {
		System.out.println("running the test case:");
		junit.textui.TestRunner.run(createTestSuite());
	}
	
	

}
