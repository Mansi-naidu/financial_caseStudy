//this class takes the value from stocks
// a stock dividend is a payment to shareholders that consists of additional shares rather than cash 
public class DividendStocks extends Stocks{

	private double dividends; //amount of dividends paid
	
	public DividendStocks(String symbol, double currentPrice) {
		super(symbol, currentPrice);
		dividends=0.0;
	}
	
	@Override
	public double getMarketvalue() {
		return super.getMarketvalue()+dividends;
	}
	
	// records the dividends per share
	public void paydividends(double amountPerShare) {
		dividends+=amountPerShare*gettotalShare();
	}
}
