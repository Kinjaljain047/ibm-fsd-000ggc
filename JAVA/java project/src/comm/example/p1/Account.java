package comm.example.p1;

public class Account {

	private int amount;
	private String accname;
	private int accno;
	
	public Account() {
		
	}
	public Account(int amount, String accname, int accno) {
		this.accname = accname;
		this.accno = accno;
		this.amount= amount;
	}
	
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accname == null) ? 0 : accname.hashCode());
		result = prime * result + accno;
		result = prime * result + amount;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accname == null) {
			if (other.accname != null)
				return false;
		} else if (!accname.equals(other.accname))
			return false;
		if (accno != other.accno)
			return false;
		if (amount != other.amount)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [amount=" + amount + ", accname=" + accname + ", accno=" + accno + "]";
	}
	
	
	
}
