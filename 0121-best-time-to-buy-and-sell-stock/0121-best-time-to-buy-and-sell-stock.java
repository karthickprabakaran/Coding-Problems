class Solution {
    public int maxProfit(int[] prices) {

        // declare the min, max and the length of the array

        // loop through the array and calculate the cost by subracting each element of the prices array
        //with the minimum element

        //compare the cost and the current max value and replace accordingly 

        int n = prices.length;

        int min = prices[0];
        int max = 0;

        for(int i=0;i<n;i++)
        {
            int cost = prices[i] - min;

            max = Math.max(cost, max);
            min = Math.min(min, prices[i]);
        }  

        return max;
        
    }
}