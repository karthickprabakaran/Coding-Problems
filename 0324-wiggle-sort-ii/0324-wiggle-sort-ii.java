class Solution {
    public void wiggleSort(int[] nums) {

        int n = nums.length;
        int j = n-1; 

        int[] arr = Arrays.copyOf(nums, n);
        Arrays.sort(arr);

        for(int i=1;i<n;i+=2){
            nums[i] = arr[j];
            j--;
        }

        for(int i=0;i<n;i+=2)
        {
            nums[i] = arr[j];
            j--;
        }
    }
}