package Package2;

public class AddArgs {
 public static void main(String[] args) {
	 int sum=0;
	 for (String a: args) {
		 try {
		 sum+= Integer.parseInt(a);
		//System.out.println(args[10]);
		 } catch(NumberFormatException nfe){
			// System.err.println("number format exception occurred");
			 System.err.println(nfe.getMessage());
			 System.exit(0);
			 
		 }
		/*catch(ArrayIndexOutOfBoundsException aeobe) {
			 System.err.println("array index out of bound exception");
			 System.exit(0);*/
			 
		 catch(Exception e) {
			 System.err.println("exception occurred");
		 }
		 
		 finally {
			 System.out.println("finally");
		 }
	 }
	 System.out.println("sum:"+sum);
	 
	 try {
 }
	 finally {
		 
	 }
}
