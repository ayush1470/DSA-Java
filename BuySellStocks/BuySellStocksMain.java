public class BuySellStocksMain {
    public static int MaxProfitStocks(int[] prices){
        int profit=0;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){  // each iteration acts as each day (what was the price of the stock on each day)
            if(buyPrice < prices[i]){
                profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit);   // to maximize the profit and check for each day
            }else{   // when buyPrice > sellingPrice
                buyPrice = prices[i];  // --> in order to minimize the buyPrice cost
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("The maximum that can be made by buying and selling stocks is: "+MaxProfitStocks(prices));
    }
}