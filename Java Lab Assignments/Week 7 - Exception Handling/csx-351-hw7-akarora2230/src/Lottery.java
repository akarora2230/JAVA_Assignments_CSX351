import java.util.*;

public class Lottery 
{
	//lottery number
	int lotteryNumber[] = new int[5];
	
	//constructor to generate a random lottery number
	public Lottery()
	{
	
		//Math.random() gives a random no bw 0 and 1... multiply it by 10 to
		// get a random no bw 0 and 10...
		//Now take floor of this to get a no bw 0 and 9
		
		//generating random lottery number
		for(int i=0; i<5; i++)
		 lotteryNumber[i] = (int) (Math.random() * 10);
		
	}
	
	//function to compare user lottery no with lotteryNumber
	int customerLotteryPick (int customerLotteryNo[])
	{
		//variabe to store no of digits matches
		int noOfDigitsMatch = 0;
		
		//checking the digit of userLotteryNo to lotteryNumber
		for(int i=0; i<5; i++)
		{
			if(lotteryNumber[i]==customerLotteryNo[i])
			{
				noOfDigitsMatch++;
			}
		}
		//return the no of digits matches
		return noOfDigitsMatch;
	}
	
	//function to find lottery number
	int[] findLotteryNumber ()
	{
		return lotteryNumber;
	}
	
	public static void main(String []arg)
	{
		//variable for taking input
		Scanner s = new Scanner(System.in);
		
		//taking the user lottery no as input
		System.out.print("Enter your lottery ticket no digit by digit : ");
		int customerLotteryNo[] = new int[5];
		for(int i=0; i<5; i++)
		{
			customerLotteryNo[i] = s.nextInt();
		}
		
		//creating a lottery class object
		//This also creates a random lottery no of the object
		
		Lottery LT = new Lottery();
			
		
		int lotteryNo[];
		lotteryNo = LT.findLotteryNumber();
		
		//printing the winner lottery number
		System.out.print("The winning lottery number is : ");
		for(int i=0; i<5; i++)
		{
			System.out.print(lotteryNo[i]+" ");
		}
		System.out.println();
		
		//checking the user lottery no with winner lottery no
		int noOfDigitsMatched = LT.customerLotteryPick(customerLotteryNo);
		System.out.println("Number of Digits Matched are : "+noOfDigitsMatched);
		
		//if the user is winner of Lottery
		if(noOfDigitsMatched == 5)
		{
			System.out.println("  |  CONGRATULATIONS YOU ARE THE WINNER OF GRAND PRIZE WORTH RUPEES 20LACS  |");
		}
		
		s.close();
	}
}
