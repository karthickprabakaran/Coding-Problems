class Solution {
    public int maxProfit(int[] prices) {

        int mini = prices[0];

        int maxi = 0;


        for(int i=0;i<prices.length;i++){
            int cost = prices[i] - mini;

            mini = Math.min(prices[i], mini);
            maxi = Math.max(maxi, cost);
        }

        return maxi;
        
    }
}