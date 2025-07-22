class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int cnt = 1;
        int max = 1;

        for(int i=0;i<nums.length -1 ;i++){
            if(nums[i] < nums[i+1]){
                cnt++;
                max = Math.max(cnt, max);
            }else{
                cnt = 1;
            }
        }

        return max;
        
    }
}