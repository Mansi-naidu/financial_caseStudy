
public class Main {
	public static void main(String[] args) {
		
	
		System.out.println("********ASSET 1*********\n");
		
		Asset a=new MutualFunds("Amazon",150);	
		a.purchase(3,100);
		// we brought a amazon share in 100 rupees but now its current value is 150 
		//so the market value of our share now is 3*150
		System.out.println("Market value of amazon in mutual funds:"+a.getMarketvalue());
		System.out.println("the profit earned on this asset is "+a.getProfit());
		
		System.out.println("\n********ASSET 2*********");
		
		Asset a2=new Stocks("flipcart",500);//here 500 is the current price of the stock
		a2.purchase(40,250);//here 250 represents the price at which we purchased the stock . so the price from 250 increased to 500
		System.out.println("The flipcart stock assert was purchased at:"+((Stocks)a2).gettotalCost());
		System.out.println("the current value of each stock "+((Stocks)a2).getcurrentPrice());
		System.out.println("the market value of the stock:"+a2.getMarketvalue());
		System.out.println("the profit earned:"+a2.getProfit());
	}
}
