class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1 = 0, xor2 = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i < n; i++) {
            xor1 ^= i;      // XOR of indices (0 to n-1)
            xor2 ^= nums[i]; // XOR of elements in array
        }
        
        xor1 ^= n; // Include 'n' in xor1 (since range is [0, n])

        return xor1 ^ xor2; // Missing number is the difference
    }
}