package comm.example.client;

import comm.example.MyDate;

public class Tester {
		public static void main(String[] args) {
			 MyDate myDate=null;
			 myDate= new MyDate();
			 myDate.createDate(19, 10, 1997);
			 System.out .println(myDate.getDetails());
		}

}
