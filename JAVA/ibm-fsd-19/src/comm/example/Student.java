package comm.example;

public class Student implements Comparable<Object>{
private String fname;
private String lname;
private double GPA;

	public Student() {
	super();
}

	public Student(String fname, String lname, double gPA) {
		super();
		this.fname = fname;
		this.lname = lname;
		GPA = gPA;
	}
	

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", GPA=" + GPA + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student student=(Student)o;
		if(this.getGPA()==student.getGPA())
		{
			return 0;
		}
		else if((this.getGPA()>student.getGPA())){
			return 1;
		}
		else {
			return -1;
		}
	}
	

}
