package HW7;

/**
 * exception specifying that user has entered amount which
 * is not multiple of 100 or 500 or 1000
 * exception constructor takes user string as input to print that message
 *
 */

public class multiple_exception extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public multiple_exception(String s) {
		super(s);
	}
	
}
