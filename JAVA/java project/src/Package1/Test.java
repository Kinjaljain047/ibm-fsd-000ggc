package Package1;

public class Test {
 public static void main (String[] args) {
	 Messaging m= Messaging.createMessagingObject();
	 Messaging m1= Messaging.createMessagingObject("test");
	 String name= m.toString();
	 System.out.println(name);
 }
}
