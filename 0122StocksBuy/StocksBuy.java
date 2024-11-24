/*
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the 
 * stock at any time. However, you can buy it then immediately sell it on the same day.
 * Find and return the maximum profit you can achieve.
 */

public class StocksBuy {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int len = prices.length;

        int profit=0;

        for(int i=0; i< len; i++){
            if(buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            else if(prices[i] > buyPrice){
                profit += (prices[i]-buyPrice);
                buyPrice = prices[i];
            }
        }
        return profit;
    }

}
