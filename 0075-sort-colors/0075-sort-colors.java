class Solution {
    public void sortColors(int[] nums) {

        int one = 0;
        int two = 0;
        int zero = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zero++;
            }else if(nums[i] == 1){
                one++;
            }else{
                two++;
            }
        }

        int i = 0;

        for(; i < zero; i++){
            nums[i] = 0;
        }
        for(; i < zero + one; i++){
            nums[i] = 1;
        }
        for(; i < zero + one + two; i++){
            nums[i] = 2;
        }
        
    }
}