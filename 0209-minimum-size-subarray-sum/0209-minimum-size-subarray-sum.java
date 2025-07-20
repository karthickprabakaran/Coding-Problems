class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n  = nums.length;

        int low = 0;
        int high = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        while(high < n){
            sum += nums[high];

            while(sum >= target){ // until the condition is correct , not doing this only once.
                int len = high - low +1;
                minLen = Math.min(minLen, len);
                sum -= nums[low];
            low++;
            }


                    high++;

            
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;


        
    }
}