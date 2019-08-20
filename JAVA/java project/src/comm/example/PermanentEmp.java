package comm.example;

public class PermanentEmp extends Employee {
	private int salary;
	
	public PermanentEmp() {
		 super();
	}
	
	public PermanentEmp(int empid, String fname,String lname, String dept,int salary) {
		super( empid, fname, lname, dept);
		this.salary= salary;
	}
	
	protected String getDetails() {
		return super.getDetails()+ " " + "salary is :"  +salary;
	}

}
