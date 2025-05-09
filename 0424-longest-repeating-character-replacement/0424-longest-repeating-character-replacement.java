class Solution {
    public int characterReplacement(String s, int k) {

        int maxLen = 0;
        int left = 0;
        int maxf = 0;
        int[] hash = new int[26];

        for(int right = 0;right < s.length();right++){

            hash[s.charAt(right)- 'A']++;
            
            maxf = Math.max(maxf, hash[s.charAt(right)- 'A']);
            
            while( ((right - left +1) - maxf) > k ){
                hash[s.charAt(left)- 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left +1);
        }
        return maxLen;
    }

}