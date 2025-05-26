import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] maxValues = new int[n - k + 1]; // Result array to store max of each window
        Deque<Integer> deque = new LinkedList<>(); // Will store indices of useful elements

        for (int i = 0; i < n; i++) {
            // \U0001f9f9 Remove indices that are out of this window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // \U0001f525 Remove indices of smaller values (from the back)
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // \U0001f4cc Add current index to deque
            deque.offerLast(i);

            // ✅ Store the max when we have a full window
            if (i >= k - 1) {
                maxValues[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return maxValues;
    }
}