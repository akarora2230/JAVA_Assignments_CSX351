package HW7;
/*
 * table class to store entries in table and checking of password etc. occurs from the 
 * information stored in it's instances that is ach user information 
 */
import java.util.Scanner;

public class table {

	private int id;
	private final int min_bal=1000;
	private double balance;
	private int password;
	private String bank_name;
	private int count=0;
	
	/**
	 * to form table....taking user entries
	 */
	
	public table() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter id ");
		id=in.nextInt();
		System.out.println("Enter password : ");
		password=in.nextInt();
		System.out.println("Enter bank name :");
		bank_name=in.next();
		System.out.println("Enter balance : ");
		balance=in.nextInt();
	
	}
	/**
	 * function return id of user
	 * @return id
	 */
	public int getid() {
		return id;
	}
	
	public String getbank_name() {
		return bank_name;
	}

	public void setcount() {
		count++;
	}
	
	public int getcount() {
		return count;
	}
	
	public int getpassword() {
		return password;
	}
	
	public double getbalance() {
		return balance;
	}
	
	
	
	public void deposit(int amt) {
		try{
			if(amt%100!=0||amt%500!=0||amt%2000!=0)
		
		{
			throw(new multiple_exception("Amount should be a multiple of 100 or 500 or 2000"));
		}
			else
				{
				balance+=amt;
				checkbalance();
				}
		}
		catch(multiple_exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void withdraw(int amt) {
		try {
			if(balance<=min_bal)
				throw (new balance_Insufficient());
			else if(amt%100!=0||amt%500!=0||amt%2000!=0)
			{
				throw(new multiple_exception("Amount should be a multiple of 100 or 500 or 2000"));
			}
			else{
				balance-=amt;
				checkbalance();
			}
		}
		catch(balance_Insufficient e)
		{
			System.out.println(e.getMessage());
		}
		catch(multiple_exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void checkbalance() {
		System.out.println("Available Balance in your Account is " + balance);
	}
	
}
