class Solution {
    public boolean isPalindrome(String s) {


        int left = 0;
        String t = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int right = t.length() -1;
        while(left < right){
            if(t.charAt(left) != t.charAt(right) ){
                return false;
            } 

            left++;
            right--;
        }

        return true;
        
    }
}