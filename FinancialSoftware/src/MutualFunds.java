
public class MutualFunds extends ShareAsset /*implements Asset*/ {
	
	
	private double totalShare;
	
	public MutualFunds(String symbol, double currentPrice) {
		super(symbol, currentPrice);
		totalShare=0.0;
	}

	public double gettotalShare() {
		return totalShare;
	}
	
	@Override
	public double getMarketvalue() {
		// TODO Auto-generated method stub
		return totalShare*getcurrentPrice();
		
	}

	
	/*
	public double getProfit() {
		// TODO Auto-generated method stub
		return getMarketvalue()-gettotalCost();
	}*/
	
	public void purchase(int shares,double pricePerShare) {
		//to the total share add the share we brought now
		totalShare+=shares;
		addCost(shares*pricePerShare);
		}

}
