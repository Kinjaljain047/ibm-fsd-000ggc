package comm.example.client;

public class Book extends Product {
	
	private String author;
	private String name;
	
	public Book() {
		super();
	}
	public Book(String author, String name) {
	super(2000);
	this.author=author;
	this.name=name;
	System.out.println(name + " " + author);
}

}
