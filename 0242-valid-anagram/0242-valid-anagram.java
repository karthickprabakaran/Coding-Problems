class Solution {
    public boolean isAnagram(String s, String t) {
        
        // If the lengths of the two strings are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26]; // Array to store character counts (only lowercase English letters)

        // Increment the count for characters in 's'
        for (char i : s.toCharArray()) { 
            arr[i - 'a']++;  
        }

        // Decrement the count for characters in 't'
        for (char i : t.toCharArray()) {  
            arr[i - 'a']--;  
        }

        // Check if all values in the array are zero (meaning equal frequency of characters)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {  // Fix: should check against 0, not null
                return false;
            }
        }
        return true;  // If no mismatches found, the strings are anagrams
    }
}