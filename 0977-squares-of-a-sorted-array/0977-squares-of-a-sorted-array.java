class Solution {
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int[] arr = new int[nums.length];
        int n = nums.length - 1;

        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                arr[n] = nums[left] * nums[left];
                left++;
            } else {
                arr[n] = nums[right] * nums[right];
                right--;
            }
            n--;
        }

        return arr;
    }
}