class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, minPrice = prices[0];
        for(int i = 1;i<prices.length;i++)
        {
            int val = prices[i] - minPrice;
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, val);
            
        }
        return maxProfit;
    }
}