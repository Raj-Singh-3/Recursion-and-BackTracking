class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0, min_price = prices[0];
        for(int i = 1;i<prices.length;i++)
        {
            int val = prices[i] - min_price;
            max_profit = Math.max(max_profit, val);
            min_price = Math.min(min_price, prices[i]);
        }
        return max_profit;
    }
}