package HW7;

/**
 * exception specifying that user has enered wrong pin
 * exception constructor takes user string as input to print that message
 *
 */

public class Invalid_PIN extends Exception {

	

	public Invalid_PIN(String s)
	{
		super(s);
	}
	
}
