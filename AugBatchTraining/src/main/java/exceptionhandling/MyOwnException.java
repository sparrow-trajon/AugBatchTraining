package exceptionhandling;

public class MyOwnException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyOwnException() {
	
		super("My own exception is occured..!");
	}
}
