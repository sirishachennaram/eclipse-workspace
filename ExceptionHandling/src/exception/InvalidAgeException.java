package exception;
//checked Exception
public class InvalidAgeException extends Exception {
	private static final long serialversionUID=1L;
	
	
	public InvalidAgeException() {
		super();
		
	}
	public InvalidAgeException(String msg) {
		super(msg);
	}
	
	

}
