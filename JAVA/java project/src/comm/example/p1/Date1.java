package comm.example.p1;
import comm.example.client.MyDate;

public class Date1 {
	public static void main (String[] args) {
		MyDate date=  new MyDate();
		date.setDay(10);
		date.setMonth(11);
		date.setYear(2000);
		System.out.println(date.getDay());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
	}

}
