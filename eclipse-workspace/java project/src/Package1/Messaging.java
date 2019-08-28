package Package1;

public class Messaging {

private String message;
private static Messaging messaging;

private  Messaging() {
	
}
public Messaging(String message) {
	this.message=message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message=message;
}

public String toString() {
	return "Messaging{" + "message=' " +message+ '\'' + '}';
}
public static Messaging createMessagingObject() {
	if (messaging==null) {
		messaging= new Messaging();
	}
	return messaging;

}
public static Messaging createMessagingObject(String name) {
	if (messaging==null) {
		messaging= new Messaging();
	}
	System.out.println("with msg" +name);
	return messaging;
	
}
}

