class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];

        int proL = 1;
        int proR = 1;

        for(int i=nums.length -1; i>=0;i--){
            ans[i] = proR;
            proR = proR * nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            ans[i] = ans[i] *proL;
            proL = proL * nums[i];
        }

        return ans;
    }
}