package HW7;

/**
 * exception specifying that user has entered wrong id
 * exception constructor takes user string as input to print that message
 *
 */

public class invalid_id_exception extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public invalid_id_exception(String s) {
		super(s);
	}
	
}
