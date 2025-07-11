class Solution {
    public int removeDuplicates(int[] nums) {

        int firstPointer = 0;
        for(int secondPointer = 0; secondPointer < nums.length;secondPointer++){
            if(nums[firstPointer] != nums[secondPointer]){
                firstPointer++;
                nums[firstPointer] = nums[secondPointer];
            }else{
                continue;
            }
        }

        return firstPointer+1;
        
    }
}