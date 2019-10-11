package beans;

public class Adress {
	private String addressLine1;
	private String addressLine2;
	public Adress() {
		super();
	}
	public Adress(String addressLine1, String addressLine2) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
	}
	@Override
	public String toString() {
		return "Adress [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + "]";
	}
	
	
	
	

}
