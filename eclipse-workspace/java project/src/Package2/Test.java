package Package2;

public class Test {
	private static 	Scanner scanner= new Scanner(System.in);
	
	public static void main (String[] args) {
		
		Account acc= new Account();
		try {
		acc.createNewAccount(123, 25000);
		
	   System.out.println(acc.toString());
		}catch(AccountNotValidException e){
			System.err.println(e.getMessage());
		}
		
	}

}
