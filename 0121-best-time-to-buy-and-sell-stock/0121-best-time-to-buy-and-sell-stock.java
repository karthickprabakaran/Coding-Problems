class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for(int i=0;i<prices.length;i++)
        {
            int cost = prices[i] - min;
            max = Math.max(cost, max);
            min = Math.min(prices[i], min);
        }

        return max;
    }
}