class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int right = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        while(right < n){
            sum = sum + nums[right];
            right++;

            while(sum >= target){
                int windowLength = right - left;

                min = Math.min(min, windowLength);
                sum = sum - nums[left];
                left++;
            }
        }   
        

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}