class Solution {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];  // Correct swapping logic
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Handle cases where k > n

        // Reverse first part
        reverse(nums, 0, n - k - 1);
        // Reverse second part
        reverse(nums, n - k, n - 1);
        // Reverse the whole array
        reverse(nums, 0, n - 1);
    }
}