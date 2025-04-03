class Solution {
    public String removeStars(String s) {
        char[] sb = s.toCharArray(); // Fixed size array
        int index = 0; // Pointer to track valid characters

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (index > 0) {
                    index--; // Remove the last character
                }
            } else {
                sb[index] = ch; // Store character at index
                index++;
            }
        }

        return new String(sb, 0, index); // Convert only valid characters to string
    }
}