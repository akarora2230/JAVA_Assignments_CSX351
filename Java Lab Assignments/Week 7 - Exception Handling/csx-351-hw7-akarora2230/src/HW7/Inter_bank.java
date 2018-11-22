package HW7;

/**
 * exception specifying that inter-bank-transaction has exceeded it's limit of three
 * exception constructor takes user string as input to print that message
 *
 */

public class Inter_bank extends Exception {

	
	public Inter_bank(String s)
	{
		super(s);
	}
	
}
