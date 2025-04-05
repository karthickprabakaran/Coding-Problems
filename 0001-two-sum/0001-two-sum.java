class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, add the number and its index to the map
            map.put(nums[i], i);
        }

        // Return empty array if no solution found
        return new int[] {};
    }
}
