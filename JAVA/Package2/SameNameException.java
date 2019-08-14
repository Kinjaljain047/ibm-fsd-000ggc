package Package2;

public class SameNameException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8826690779167537346L;
	private String msg;
	public SameNameException() {
		super();
	}
	public SameNameException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	 
	
	

}
