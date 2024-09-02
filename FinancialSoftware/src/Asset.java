public interface Asset {

	//how much asset is worth
	public double getMarketvalue();
	
	//how much money has been made on this asset
	public double getProfit();
	
	public void purchase(int shares,double pricePerShare);// this method tell the asset we purchased
}
