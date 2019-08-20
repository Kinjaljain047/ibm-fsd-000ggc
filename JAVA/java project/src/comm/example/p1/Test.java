package comm.example.p1;

public class Test {
	public static void main (String[] args) {
		Account a1;
		a1= new Account(2000, "raj", 203);
		Account a2;
		a2= new Account(3000, "ram", 204);
		
		if(a1.equals(a2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
	}

}
