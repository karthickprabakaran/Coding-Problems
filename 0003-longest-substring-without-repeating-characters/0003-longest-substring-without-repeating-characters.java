class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();

        int left = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();

        for(int right = 0;right<n;right++){
            if(set.contains(s.charAt(right))){
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(s.charAt(right));
            int length = right - left +1;
            max = Math.max(length, max);
        }
        return max;
        
    }
}