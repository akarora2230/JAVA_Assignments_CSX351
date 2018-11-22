import java.util.Scanner;
public class Stock {

	public static void  sort_asc_S(StockHolding [] STOCKS)
	{
		
		   //Selection Sort
		for(int i=0;i<STOCKS.length;i++)
		{
			StockHolding temp;
			for(int j=i+1;j<STOCKS.length;j++)
			{
						
				if(STOCKS[i].companyName.compareTo(STOCKS[j].companyName ) <0)
				//SWAP A[i] and A[j]
					{
				temp= STOCKS[i];
				STOCKS[i]=STOCKS[j];
				STOCKS[j]=temp;
					}
			}
		}
		System.out.println("Display of stock in ascending order by name : ");
		for(int i=0; i<STOCKS.length; i++)
		{
			System.out.println("Company Name : "+STOCKS[i].companyName);
			System.out.println("Purchase Share Price : "+STOCKS[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+STOCKS[i].currentSharePrice);
			System.out.println("Number of Shares : "+STOCKS[i].numberOfShares);
			System.out.println();
		}
	}
	/*********************************************/
	
	public static void  sort_des_F(ForeighStockHolding [] STOCKS)
	{
		
		   //Selection Sort
		for(int i=0;i<STOCKS.length;i++)
		{
			ForeighStockHolding temp;
			for(int j=i+1;j<STOCKS.length;j++)
			{
						
				if(STOCKS[i].companyName.compareTo(STOCKS[j].companyName ) <0)
				//SWAP A[i] and A[j]
					{
				temp= STOCKS[i];
				STOCKS[i]=STOCKS[j];
				STOCKS[j]=temp;
					}
			}
			}
		
			System.out.println("Display of stock in descending order by name : ");
			for(int i=0; i<STOCKS.length; i++)
			{
				System.out.println("Company Name : "+STOCKS[i].companyName);
				System.out.println("Purchase Share Price : "+STOCKS[i].purchaseSharePrice);
				System.out.println("Current Share Price : "+STOCKS[i].currentSharePrice);
				System.out.println("Number of Shares : "+STOCKS[i].numberOfShares);
				System.out.println("Conversion Rate : "+STOCKS[i].conversionRate);
				System.out.println();
			}
		}
	
	public static void  sort_asc_F(ForeighStockHolding [] STOCKS)
	{
		
		   //Selection Sort
		for(int i=0;i<STOCKS.length;i++)
		{
			ForeighStockHolding temp;
			for(int j=i+1;j<STOCKS.length;j++)
			{
						
				if(STOCKS[i].companyName.compareTo(STOCKS[j].companyName ) <0)
				//SWAP A[i] and A[j]
					{
				temp= STOCKS[i];
				STOCKS[i]=STOCKS[j];
				STOCKS[j]=temp;
					}
			}
		}
		System.out.println("Display of stock in ascending order by name : ");
		for(int i=0; i<STOCKS.length; i++)
		{
			System.out.println("Company Name : "+STOCKS[i].companyName);
			System.out.println("Purchase Share Price : "+STOCKS[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+STOCKS[i].currentSharePrice);
			System.out.println("Number of Shares : "+STOCKS[i].numberOfShares);
			System.out.println();
		}
	}
	
	/************************************************************************************/
	
	static void displayMinValue (ForeighStockHolding array[])
	{
		//temp object of ForeignStockHolding to store min value stock
		ForeighStockHolding temp = array[0];
		
		//traversing the array to find the min value stock
		for(int i=1; i<array.length; i++)
		{
			if(temp.valueInDollars() > array[i].valueInDollars())
			{
				temp = array[i];
			}
		}
		
		//printing the minimum value stock
		System.out.println("Minimum Value Stock :");
		System.out.println("Company Name : "+temp.companyName);
		System.out.println("Purchase Share Price : "+temp.purchaseSharePrice);
		System.out.println("Current Share Price : "+temp.currentSharePrice);
		System.out.println("Number of Shares : "+temp.numberOfShares);
		System.out.println("Conversion Rate : "+temp.conversionRate);
		System.out.println();
	}
	
	static void displayMaxValue (ForeighStockHolding array[])
	{
		//temp object of ForeignStockHolding to store max value stock
		ForeighStockHolding temp = array[0];
		
		//traversing the array to find the max value stock
		for(int i=1; i<array.length; i++)
		{
			if(temp.valueInDollars() < array[i].valueInDollars())
			{
				temp = array[i];
			}
		}
		
		//printing the maximum value stock
		System.out.println("Maximum Value Stock :");
		System.out.println("Company Name : "+temp.companyName);
		System.out.println("Purchase Share Price : "+temp.purchaseSharePrice);
		System.out.println("Current Share Price : "+temp.currentSharePrice);
		System.out.println("Number of Shares : "+temp.numberOfShares);
		System.out.println("Conversion Rate : "+temp.conversionRate);
		System.out.println();
	}
	
	static void displayMaxProfitableStock(ForeighStockHolding array[])
	{
		//temp object of ForeignStockHolding to store max profitable stock
		ForeighStockHolding temp = array[0];
		
		//traversing the array to find the max profitable stock
		for(int i=1; i<array.length; i++)
		{
			if((temp.valueInDollars()-temp.costInDollars()) < (array[i].valueInDollars()-array[i].costInDollars()))
			{
				temp = array[i];
			}
		}
		
		//printing the maximum profitable stock
		System.out.println("Maximum Profitable Stock :");
		System.out.println("Company Name : "+temp.companyName);
		System.out.println("Purchase Share Price : "+temp.purchaseSharePrice);
		System.out.println("Current Share Price : "+temp.currentSharePrice);
		System.out.println("Number of Shares : "+temp.numberOfShares);
		System.out.println("Conversion Rate : "+temp.conversionRate);
		System.out.println();
	}
	
	static void displayMinProfitableStock(ForeighStockHolding array[])
	{
		//temp object of ForeignStockHolding to store min profitable stock
		ForeighStockHolding temp = array[0];
		
		//traversing the array to find the min profitable stock
		for(int i=1; i<array.length; i++)
		{
			if((temp.valueInDollars()-temp.costInDollars()) > (array[i].valueInDollars()-array[i].costInDollars()))
			{
				temp = array[i];
			}
		}
		
		//printing the minimum profitable stock
		System.out.println("Minimum Profitable Stock :");
		System.out.println("Company Name : "+temp.companyName);
		System.out.println("Purchase Share Price : "+temp.purchaseSharePrice);
		System.out.println("Current Share Price : "+temp.currentSharePrice);
		System.out.println("Number of Shares : "+temp.numberOfShares);
		System.out.println("Conversion Rate : "+temp.conversionRate);
		System.out.println();
	}
	
	static void displayInSortedValueOrder (ForeighStockHolding array[])
	{
		//selection sort
		for(int i=0; i<array.length; i++)
		{
			ForeighStockHolding temp;
			for(int j=i+1; j<array.length; j++)
			{
				//if value at index j is lexicographically less than that at i swap them
				if(array[j].valueInDollars() < array[i].valueInDollars())
				{
					temp = array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		
		//print in the stock in ascending order
		System.out.println("Display of stock in ascending order by value : ");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("Company Name : "+array[i].companyName);
			System.out.println("Purchase Share Price : "+array[i].purchaseSharePrice);
			System.out.println("Current Share Price : "+array[i].currentSharePrice);
			System.out.println("Number of Shares : "+array[i].numberOfShares);
			System.out.println("Conversion Rate : "+array[i].conversionRate);
			System.out.println();
		}		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//array of StockHolding
				StockHolding STOCKS[] = new StockHolding[3];
				
				STOCKS[0] = new StockHolding((float)2.30, (float)4.50, (int)40, "Cr7 limited");
				STOCKS[1] = new StockHolding((float)12.19, (float)10.56, (int)90, "L10 Pvt Limited");
				STOCKS[2] = new StockHolding((float)45.10, (float)49.51, (int)210, "21LVA Ltd.");
				
				//function to display in alphabetical order
				sort_asc_S(STOCKS);
				
				//array of ForeignStockHolding
				ForeighStockHolding FR_STOCKS[] = new ForeighStockHolding[3];
				
				FR_STOCKS[0] = new ForeighStockHolding((float)1.30, (float)3.50, (int)30, "Recron limited", (float)0.94);
				FR_STOCKS[1] = new ForeighStockHolding((float)2.19, (float)2.56, (int)60, "Utratech Pvt Limited", (float)1.10);
				FR_STOCKS[2] = new ForeighStockHolding((float)5.10, (float)4.51, (int)10, "Gulf Oil", (float)1.25);
				
				//function to display in reverse alphabetical order
				sort_des_F(FR_STOCKS);
				
				
				//modifying the application according to the user 
				
				//taking no of stock from user
				Scanner input = new Scanner(System.in);
				
				System.out.print("Enter no of stocks(Do not enter more than 8 stocks) : ");
				
				//no of stock user want to access
				int n = input.nextInt();
				
				//declaring array of ForeignStockHolding  as  per user requirement 
				ForeighStockHolding STOCKS_F[] = new ForeighStockHolding[n];
				
				for(int i=0; i<n; i++)
				{
					//to take the type of stock user want to enter
					int type_Stock;
					
					System.out.print("Press enter\n 1). For StockHolding \n 2). For ForeignStockHolding \n");
					
					//taking the type of stock
					type_Stock = input.nextInt();
					
					//declaring the variable to take input for purchaseSharePrice, currentSharePrice, conversionRate
					float purchasePrice,currentPrice, conRate;
					
					//declaring the variable to take input for numberOfShares
					int noOfShare;
					
					//declaring the variable to take input for companyName
					String c_ame;
					
					//taking input from user for each field specified in stock
					System.out.print("Enter the purchaseSharePrice for stock : ");
					purchasePrice = input.nextFloat();
					System.out.print("Enter the currentSharePrice for stock : ");
					currentPrice = input.nextFloat();
					System.out.print("Enter the noOfShares for stock : ");
					noOfShare = input.nextInt();
					System.out.print("Enter the companyName for stock : ");
					c_ame = input.next();
					
					//if the stock is of type StockHolding then conversion rate is 1 else take input from user
					if(type_Stock == 1)
					{
						conRate = 1;
					}
					else 
					{
						System.out.print("Enter the conversion Rate for foreign stock");
						conRate = input.nextFloat();
					}
					
					//initialize the stock type as per user requirement
					STOCKS_F[i] = new ForeighStockHolding(purchasePrice, currentPrice, noOfShare, c_ame, conRate);
				}
				
				//a variable of boolean type
				boolean value = true;
				
				//continue loop until user donot command to exit
				while(value)
				{
					System.out.println("Enter your choice : \n    1) To display stock information with the lowest value\r\n" + 
							"    2) To display stock with the highest value\r\n" + 
							"    3) To display the most profitable stock\r\n" + 
							"    4) To display the least profitable stock\r\n" + 
							"    5) To list all stocks sorted by company name (A-Z)\r\n" + 
							"    6) To list all stocks sorted from the lowest value to the highest value\r\n" + 
							"    7) To exit");
					
					//variable to take choice of user
					int choice = input.nextInt();
					
					switch(choice)
					{
						case 1: 
						{
							displayMinValue(STOCKS_F);
							break;
						}
						case 2:
						{
							displayMaxValue(STOCKS_F);
							break;
						}
						case 3:
						{
							displayMaxProfitableStock(STOCKS_F);
							break;
						}
						case 4:
						{
							displayMinProfitableStock(STOCKS_F);
							break;
						}
						case 5:
						{
							sort_asc_S(STOCKS_F);
							break;
						}
						case 6:
						{
							displayInSortedValueOrder(STOCKS_F);
							break;
						}
						case 7:
						{
							value = false;
						}
					}
					
				}
				System.out.println("EXITING THE SYSTEM\n\nSYSTEM EXIT STATUS    : RETURNED");
				input.close();
			}

	}


