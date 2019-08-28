package Package2;

import java.io.Serializable;

public class Account implements Serializable {
	
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -6559541045155739859L;
	private int accountno;
	 private  double amount;
	 
	 
	public Account() {
		super();
	}
	public Account(int accountno, double amount) {
		super();
		this.accountno = accountno;
		this.amount = amount;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", amount=" + amount + "]";
	}
	
	 public Account  createNewAccount(int accountno , double amount) throws AccountNotValidException{
		 this.accountno=accountno;
		 this.amount=amount;
		 if(amount < 10000) {
			 throw new AccountNotValidException("not a valid account");
		 }
		 return new Account(accountno, amount);
	 }
	 

}
