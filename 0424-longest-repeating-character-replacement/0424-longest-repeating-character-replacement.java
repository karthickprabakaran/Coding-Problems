class Solution {
    public int characterReplacement(String s, int k) {
        
        int n = s.length();
        int left = 0;
        int[] hash = new int[26];
        int maxf = 0;
        int maxLen = 0;
        for(int right=0;right<n;right++){
            hash[s.charAt(right) - 'A']++;

            maxf = Math.max(maxf, hash[s.charAt(right) - 'A']);

            int changes = (right - left +1) - maxf;

            if(changes > k){
                hash[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right -left +1);
        }

        return maxLen;
    }
}