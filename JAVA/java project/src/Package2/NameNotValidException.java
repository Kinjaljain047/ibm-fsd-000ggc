package Package2;

public class NameNotValidException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2668709485473639638L;
	private String message;
	public NameNotValidException() {
		super();
	}
	public NameNotValidException(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
