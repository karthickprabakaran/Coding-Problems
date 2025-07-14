class Solution {
    public void sortColors(int[] nums) {

        int start = 0;
        int mid = 0;
        int end = nums.length -1;

        while(mid <= end){
            if(nums[mid] == 0){
                swap(nums,start, mid);
                mid++;
                start++;
            }else if (nums[mid] == 1){
                mid++;
            }else{
                swap(nums,mid, end);
                end--;
            }
        }
        
    }

    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
         nums[left] = nums[right];
         nums[right] = temp;
    } 
}