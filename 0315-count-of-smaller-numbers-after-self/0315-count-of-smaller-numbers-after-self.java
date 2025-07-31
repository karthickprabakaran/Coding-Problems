import java.util.*;

public class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();

        // Traverse from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            int index = binaryInsert(sortedList, nums[i]);
            result.add(index);
        }

        // Reverse the result to match original order
        Collections.reverse(result);
        return result;
    }

    private int binaryInsert(List<Integer> list, int num) {
        int low = 0;
        int high = list.size();

        // Binary search to find the insertion point
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (num <= list.get(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        // Insert the element into the sorted list
        list.add(low, num);
        return low;
    }
}