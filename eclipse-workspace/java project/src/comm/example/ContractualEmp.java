package comm.example;

public class ContractualEmp extends Employee{
 private int rateperhour;
 
 public ContractualEmp() {
	 super();
 }
 public ContractualEmp( int empid, String fname, String lname, String dept,int rateperhour) {
	 super(empid,fname,lname,dept);
	 this.rateperhour=rateperhour;
 }
 
 protected String getDetails() {
	 return (super.getDetails() + " " + "rateperhour: " +rateperhour);
 }
 
}
