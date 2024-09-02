// it is a asset called share
// any asset that is based on share will extend this class
//example: stocks and mutual funds 
// though both mutual funds and stocks store asset based on share but the type of share is different 
// so we have a variable symbol in this class that tells which type of share it is 

/*note::
 * this class cannot be intiatiated because shareAsset is not a type of asset that a 
 * client buys it is just a  concept 
 * that is represented in code 
 * so we need to declare this class as abstract i.e we cannot create a object of shareAsset
 * */

/*
 * we see that we have implemented asset her the uses of doing this is that it reduces redundancy
 * as we know stocks and mutual funds uses shareasset concept and they also are a type of asset 
 * so we use to write : public class Stocks extends ShareAsset implements Asset
 * now as we made this as an abstract class that can be shared among relevant classes so now its enough to
 * extend this class
 * */
public abstract class ShareAsset implements Asset {

	private String symbol;
	private double totalCost;
	private double currentPrice;
	
	public ShareAsset(String symbol,double currentPrice) {
		this.symbol=symbol;
		this.currentPrice=currentPrice;
		totalCost=0.0;
	}
	
	
	//adds cost of certain amount to this asset 
	public void addCost(double cost) {
		totalCost+=cost;
	}
	
	//will return the price of each share in this asset
	public double getcurrentPrice() {
		return currentPrice;
	}
	
	public double gettotalCost() {
		return totalCost;
	}
	
	// to set the current share price use a setter
	public void setcurrentPrice(double currentPrice) {
		this .currentPrice=currentPrice;
	}
	
	//the redundancy of methods getmarketvalue and getProfit is occured between mutualfunds and stocks 
	//so make those methods abstract here
	
	public abstract double getMarketvalue();
	
	public double getProfit() {
		System.out.println("market value="+getMarketvalue()+"total cost="+totalCost);
		return getMarketvalue()-totalCost;
		
	}
}
