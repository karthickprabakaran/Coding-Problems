class Solution {
    public int searchInsert(int[] arr, int target) {

        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;  // Initialize to n (length) in case target is greater than all elements

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;  // Move left
            } else {
                low = mid + 1;  // Move right
            }
        }
        return ans;
    }
}