class Solution {
    public String minWindow(String s, String t) {
        int min = Integer.MAX_VALUE;
        int sIndex = -1;
        int cnt = 0;

        int left = 0;
        int[] hash = new int[128]; // Assuming ASCII characters

        for (int i = 0; i < t.length(); i++) {
            hash[t.charAt(i)]++;
        }

        for (int right = 0; right < s.length(); right++) {
            char rChar = s.charAt(right);
            if (hash[rChar] > 0) {
                cnt++;
            }
            hash[rChar]--;

            while (cnt == t.length()) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    sIndex = left;
                }

                char lChar = s.charAt(left);
                hash[lChar]++;
                if (hash[lChar] > 0) {
                    cnt--;
                }
                left++;
            }
        }

        return sIndex == -1 ? "" : s.substring(sIndex, sIndex + min);
    }
}