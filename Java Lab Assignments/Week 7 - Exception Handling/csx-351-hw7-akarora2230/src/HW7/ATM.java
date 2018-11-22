package HW7;
import java.util.*;

public class ATM {

	public static void main(String[] args) {
		
		int i,userid,pass,j=-1;
		long terminationTime,startTime;
		
		Scanner in=new Scanner(System.in);
				
		table t[]=new table[10];	
		
		System.out.println("\nEnter number of entries you want in table :");
		int n=in.nextInt();
		
		System.out.println("Please fill entries in table : ");
		
		for(i=0;i<n;i++)
		{
			t[i]=new table();
		}
		//loop to continue processes of ATM transaction
		sos: while(true) {
			
			System.out.println();
			System.out.println("Enter 1 to withdraw amount");
			System.out.println("Enter 2 to deposit amount");
			System.out.println("Enter 3 to check balance");
			System.out.println("Enter 4 to exit");
			System.out.println("Enter your choice: ");
			
			//Used to check if the customer stalls execution
			
			startTime=System.currentTimeMillis();
			i=in.nextInt();
			terminationTime=System.currentTimeMillis();
			
			//check for timeout
			
			try {
				if(terminationTime-startTime>10000)
					throw(new TimeOutException("Transaction Timed Out  !!"));
				
			}
			catch(TimeOutException e) {
				System.out.println(e.getMessage());
			}

			
			try {
			if(i<=0||i>4)
				throw (new invalid_option_exception("Wrong choice Entered,\nTry again"));
			
			System.out.println("Enter userid :");
			userid=in.nextInt();
			startTime=System.currentTimeMillis();
			System.out.println("Enter password :");
			pass=in.nextInt();

			terminationTime=System.currentTimeMillis();
			
			try {
				if(terminationTime-startTime>10000)
					throw(new TimeOutException("Transaction Timed Out!!"));
					
			}
			catch(TimeOutException e) {
				System.out.println(e.getMessage());
				continue sos;
			}
			for(int k=0;k<n;k++)
			{
				if(t[k].getid()==userid)
					{
						j=k;
						break;
					}
			}
			if(j==-1)
				throw(new invalid_id_exception("Wrong ID enterd!!"));
			if(t[j].getpassword()!=pass)
				throw(new Invalid_PIN("Wrong PIN entered!!\n"));
			}
			catch(invalid_option_exception e){
				System.out.println(e.getMessage());}
			catch(Invalid_PIN e) {
				System.out.println(e.getMessage());}
				catch(invalid_id_exception e) {
					System.out.println(e.getMessage());
				}
			
			switch(i)
			{
			
			      //withdraw
			case 1:
				
				System.out.println("enter bank from which you want to withdraw money ");
				String name=in.next();
				try {
					if(t[j].getcount()>3)
						throw(new Inter_bank("number of inter-bank transaction exceeded 3"));
				}
				catch(Inter_bank e)
				{
					System.out.println(e.getMessage());
				}
				System.out.println("enter amount to withdraw ");
				int amount=in.nextInt();
				if(!(t[j].getbank_name().equals(name)))
					t[j].setcount();
				t[j].withdraw(amount);
				
				break;
				
			case 2:
				//deposit
				
				System.out.println("enter bank in which you want to deposit money ");
				name=in.next();
				try {
					if(t[j].getcount()>3)
						throw(new Inter_bank("number of inter-bank transaction exceeded 3"));
					if(!(t[j].getbank_name().equals(name)))
						t[j].setcount();
					System.out.println("enter amount to deposit ");
					amount=in.nextInt();
					t[j].deposit(amount);
				}
				catch(Inter_bank e)
				{
					System.out.println(e.getMessage());
				}
							
				break;
				
			case 3:
				
				// check balance
				t[j].checkbalance();
				break;
			case 4:
				break sos;
			default:
				System.out.println("Wrong choice Entered, \nTry again");
			}
		}
		
		in.close();

	}

}
