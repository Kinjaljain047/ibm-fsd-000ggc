package comm.example.client;

public class Product {
 private int currate;
 
 private static int item;
 
 static {
	 item=0;
 }
 public Product() {
	 
 }
 
 public Product(int currate) {
	 super();
	 item ++ ;
	 this.currate= currate;
	 System.out.println(item+ " " +currate);
	 }

 
 }

