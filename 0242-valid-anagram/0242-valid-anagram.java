class Solution {
    public boolean isAnagram(String s, String t) {

        int[] arr = new int[26];

        for(char i : s.toCharArray()){
            arr[i- 'a']++;
        }
        
        for(char i : t.toCharArray()){
            arr[i- 'a']--;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0) return false;
        }

        return true;
    }
}