// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int n=prices.length;
        int maxProfit=0;
        //int cost=0;
        for(int i=0;i<n;i++){
            int cost=prices[i]-mini;
            maxProfit=Math.max(maxProfit,cost);
            mini=Math.min(mini,prices[i]);
        }
        return maxProfit;
        
    }
}