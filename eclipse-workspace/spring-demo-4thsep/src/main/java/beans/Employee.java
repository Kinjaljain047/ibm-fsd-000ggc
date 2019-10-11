package beans;

public class Employee {
	private int id;
	private String fname;
	private String lname;
	private String email;
	private Adress address;
	

	public Employee() {
		super();
	}


	public Employee(int id, String fname, String lname, String email, Adress address) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", address="
				+ address + "]";
	}

	
	
}