package Package1;

public class ArrayDemo {

	private char arr[];
	//private Integer a= new Integer(10);
	//autoboxing
	//private Integer a=10;
	//auto unboxing
	//int b=a;
	
	public ArrayDemo() {
		
	}
	public void createArray(int length) {
		arr= new char[length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(char) ('A'+i);
		}
		
	}
	public char[] getArray() {
		return arr;
	}
	
}
