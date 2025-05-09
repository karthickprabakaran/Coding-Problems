class Solution {
    public int maxArea(int[] height) {

        int maxLen = 0;
        int n = height.length;
        int left = 0;
        int right = n - 1;

        while( left < right){
            int area = (Math.min(height[left], height[right])) * (right - left );

            maxLen = Math.max(maxLen, area);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        } 

        return maxLen;       
    }
}