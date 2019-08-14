package Package2;

import java.io.Serializable;
import java.util.Scanner;

public class Name implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -73806133576295321L;
	private String fname;
	private String lname;

	public Name() {
		super();
	}
	public Name(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
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
	@Override
	public String toString() {
		return "Name [fname=" + fname + ", lname=" + lname + "]";
	}
	
	public Name createName(String fname, String lname) throws NameNotValidException{
		this.fname= fname;
		this.lname= lname;
		if(!(Character.isUpperCase(fname.charAt(0)) && Character.isUpperCase(lname.charAt(0)))) {
			throw new NameNotValidException("name not valid");
		//	throw new InputMismatchException("input is not valid");
		}
		System.out.println("valid name");
		return new Name(fname, lname);
	}
	
	public void compare(Object obj,Object obj1) throws SameNameException{
		Name n1=(Name) obj;
		Name n2= (Name) obj1;
		
		if((n1.fname.equals(n2.fname)) && (n1.lname.equals(n2.lname))){
			throw new SameNameException("sorry it cant be posible");
		}
		System.out.println("user already exists");
	}
	

}
