class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find the first decreasing element from the right
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            // If no such index is found, the array is in descending order, reverse it
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 2: Find the smallest element in the right that is greater than nums[index]
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                // Swap nums[i] and nums[index]
                swap(nums, i, index);
                break;
            }
        }

        // Step 3: Reverse the elements to the right of index
        reverse(nums, index + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}