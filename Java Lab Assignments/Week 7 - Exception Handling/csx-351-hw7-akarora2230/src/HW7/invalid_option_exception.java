package HW7;

/**
 * exception specifying that user has chosen an invalid option
 * exception constructor takes user string as input to print that message
 *
 */

public class invalid_option_exception extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */


	public invalid_option_exception(String s)
	{
		super(s);
	}
	
}
