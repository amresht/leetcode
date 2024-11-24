/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different 
 * day in the future to sell that stock.Return the maximum profit you can achieve from this transaction. 
 * If you cannot achieve any profit, return 0.
 */
public class StocksBuy {
    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int len = prices.length;

        int profit=0;

        for(int i=0; i< len; i++){
            if(buyPrice > prices[i]) {
                buyPrice = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyPrice );
        }

        return profit;
        
    }
}
