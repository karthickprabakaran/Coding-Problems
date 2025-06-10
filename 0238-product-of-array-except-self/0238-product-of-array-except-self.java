class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];

        int prodL = 1;
        int prodR = 1;

        for(int i=nums.length -1;i>=0;i--){
            ans[i] = prodR;
            prodR = prodR*nums[i];
        }

        for(int i=0;i<nums.length;i++){
            ans[i] = prodL * ans[i];
            prodL = prodL* nums[i];
        }

        return ans;
        
    }
}