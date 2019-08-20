package Package1;

public class Test1 {
    public static void main(String[] args) {
	
	ArrayDemo arraydemo= new ArrayDemo();
	arraydemo.createArray(26);
	char[] arr= arraydemo.getArray();
	for(char c:arr) {
		System.out.print(c+ ",");
	}
}
}
