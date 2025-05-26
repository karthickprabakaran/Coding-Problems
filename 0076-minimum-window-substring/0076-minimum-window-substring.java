class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] hash = new int[128]; // ASCII size
        for (char c : t.toCharArray()) {
            hash[c]++;
        }

        int left = 0;
        int right = 0;
        int count = t.length(); // total chars to match
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char rChar = s.charAt(right);
            if (hash[rChar] > 0) count--;
            hash[rChar]--; // Always decrement, even if not in t
            right++;

            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char lChar = s.charAt(left);
                hash[lChar]++;
                if (hash[lChar] > 0) count++; // Needed char removed
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
