
public class Cash implements Asset { //cash is a fixed asset so its value doesnot change 

	private double amount; //the amount of money held
	
	public Cash(double amount) {
		this.amount=amount;
	}
	
	
	@Override
	public double getMarketvalue() {
		return amount; //as cash is fixed asset we directly return the amount we have 
	}

	
	//as cash is fixed asset so it has no profit 
	@Override
	public double getProfit() {  
		return 0;
	}
	
	public void setAmount(double amount) {
		this.amount=amount;
	}

    // as cash is a fixed asset .it is the amount we have so we cannot purchase it it is own by user
	@Override
	public void purchase(int shares, double pricePerShare) {
		// TODO Auto-generated method stub
		shares=0;
		pricePerShare=0;
		System.out.println("not possible to buy a asset cash:");
	}

}
