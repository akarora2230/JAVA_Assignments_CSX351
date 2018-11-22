package HW7;

/**
 * exception specifying that there is insufficient balance in user account
 * exception constructor takes no argument print this message
 *
 */

public class balance_Insufficient extends Exception {

	
	public balance_Insufficient(){
		super("Insufficient balance, you cannot withdraw money!!");
	}
	
}