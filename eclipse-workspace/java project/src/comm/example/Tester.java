package comm.example;

public class Tester {

	public static void main(String[] args) {
		Employee e1 = new PermanentEmp(1, "ram", "kumar","abc",2000);
		Employee e2= new ContractualEmp(2, "sam" , "kumar", "xyz",3000);
		
		e1.getDetails();
		System.out.println(e1.getDetails());
		
		e2.getDetails();
		System.out.println(e2.getDetails());
	}
	
}
