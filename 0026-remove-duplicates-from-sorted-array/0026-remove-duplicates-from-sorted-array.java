class Solution {
    public int removeDuplicates(int[] nums) {

        int unique = 0;

        for(int current =0; current < nums.length;current++){
            if(nums[current] != nums[unique]){
                unique++;
                nums[unique] = nums[current];
            }
        }
        
        return unique +1;
    }
}