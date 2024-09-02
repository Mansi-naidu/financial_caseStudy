
public class Stocks extends ShareAsset //implements Asset// as we made shareasset abstract and it implements asset so no need to implement here
{
	
	private int totalShare;
	
	public Stocks(String symbol ,double currentPrice) {
		super(symbol, currentPrice);
		totalShare=0; //whenever we buy a stock the share becomes 0
	}

	private int totalShares;
	//constructor 
	

	@Override
	public double getMarketvalue() {
		//the number of shares * the current price of shares 
		return totalShare*getcurrentPrice();
	}

	/*@Override
	public double getProfit() {
		// TODO Auto-generated method stub
		return getMarketvalue()-gettotalCost();//current price of stock and the price in which we brought it.)
	}
	
	*/// no need of this method as shareasset will implement it as this method
	/*is common for mutulafunds and stocks
	 * we cannot remove getmarket value because its different in both classes
	 * 
	 */
	
	
	public int gettotalShare() {
		return totalShare;
	}
	
	
	//this method or behavior records the stocks we purchased 
	//i.e the how many shares we have and cost of those shares
	
	public void purchase(int shares,double pricePerShare) {
		//to the total share add the share we brought now
		totalShare+=shares;
		addCost(shares*pricePerShare); //what ever shares we purchased now need to be added in total cost
	}                                  //so this addcost method does that modifies the totalcost 
	                                   //whenever we  buy a share
}

//example:
/* we have an amazon stocks of 1 year 
 * we have 10 shares and every share value is 100 
 * so the totalCost of share is 1000
 * if the marketvalue is 2000 for that share i.e each share price is increased form 100 to 200 so the market 
 * value becomes 2000
 * now our profit will be current market value of the share - the total cost of share(in which we brought them) 
 * i.e 2000-1000=1000 is our profit
 * */
