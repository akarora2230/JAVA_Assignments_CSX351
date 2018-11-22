
public class   ForeighStockHolding extends StockHolding 
{
	
	float conversionRate;
	
	public ForeighStockHolding(float purchasePrice, float currentPrice, int noOfShare, String cname, float c_rate) {

	super( purchasePrice, currentPrice, noOfShare,  cname);
	conversionRate=c_rate;
	
	}
	public float costInDollars()
	{
		return conversionRate * numberOfShares * purchaseSharePrice;
		
	}
	
    public float valueInDollars()
{
	
    	return conversionRate * numberOfShares * currentSharePrice;
    	
}

}
