public class StockHolding {

	float purchaseSharePrice;
	float currentSharePrice;
	int numberOfShares;
	String companyName;
	
	
	public StockHolding() 
	{
		// TODO Auto-generated constructor stub
	}
           //Parameterized constructor   
	StockHolding(float purchasePrice, float currentPrice, int noOfShare, String c_name)
	{
		purchaseSharePrice = purchasePrice;
		currentSharePrice = currentPrice;
		numberOfShares = noOfShare;
		companyName = c_name;
	}
	
	
	
	/*Accessory Methods for all variables:*/
	
	public float getPurchaseSharePrice() {
		return purchaseSharePrice;
	}
	public void setPurchaseSharePrice(float purchaseSharePrice) {
		this.purchaseSharePrice = purchaseSharePrice;
	}
	public float getCurrentSharePrice() {
		return currentSharePrice;
	}
	public void setCurrentSharePrice(float currentSharePrice) {
		this.currentSharePrice = currentSharePrice;
	}
	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	void display()
	{
		System.out.println("Name of Company   :	 "+ companyName 
				             +"\nNumber of shares        : "+numberOfShares +
				              "\nPurchase Selling Price  :  " + purchaseSharePrice
				             +"\nCurrent Seling PRice    : " +currentSharePrice);
	}
	
	/*---------------------------------------------------------*/
	
	float costInDollars()
	{
		return currentSharePrice * numberOfShares;
	}
	
	float valueInDollars()
{
		return numberOfShares * currentSharePrice;
			
}
	
}