package HW7;

/**
 * exception specifying timeout of transaction has taken place
 * exception constructor takes user string as input to print that message
 *  */

public class TimeOutException extends Exception {


	public TimeOutException(String s)
	{
		super(s);
	}
	
}
