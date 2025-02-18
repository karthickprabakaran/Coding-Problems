class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        int[] temp = new int[k]; // Store last k elements

        // Store the last k elements in temp
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // Shift the remaining elements to the right
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }

        // Copy temp elements back to the beginning
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}