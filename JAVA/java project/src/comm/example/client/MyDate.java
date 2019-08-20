package comm.example.client;

public class MyDate {
	private int day;
	private int month;
	private int year;
	 public boolean setDay(int d) {
		
		 if (d<=30) {
			
			 day=d;
			return true;
		}
		else {
			day=0;
			return false;
		}
		
		
		 
	 }
	 public boolean setMonth(int m) {
		  if (m<=12) {
			  month=m;
			  return true;
		  }
		  else {
			  month=0;
			  return false;
		  }
		  
	 }
	 public boolean setYear(int y) {
		 if (y<= 2019) {
			 year=y;
			 return true;
		 }
		 else {
			 year=0;
			 return false;
		 }
		
	 }
	 public int getDay() {
		 return day;
		 
	 }
	 public int getMonth() {
		 return month;
	 }
      public int getYear() {
    	  return year;
      }
}
