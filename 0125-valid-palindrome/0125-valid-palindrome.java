class Solution {
    public boolean isPalindrome(String s) {
        
        // Convert to lowercase and remove all non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {  // If mismatch found, return false
                return false;
            }
            i++;
            j--;
        }
        return true; // If loop completes, it is a palindrome
    }
}