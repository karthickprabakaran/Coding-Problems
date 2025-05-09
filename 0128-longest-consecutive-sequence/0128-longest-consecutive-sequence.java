class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLen = 0;

        for (int num : numSet) {
            // only try to build sequence from numbers that are the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int length = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }

                maxLen = Math.max(maxLen, length);
            }
        }

        return maxLen;
    }
}