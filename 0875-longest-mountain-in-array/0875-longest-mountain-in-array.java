class Solution {
    public int longestMountain(int[] arr) {

        int n = arr.length;
        int max = 0;
        int i = 1;

        while ( i < n-1){
            if(arr[i] > arr[i-1] && arr[i+1] < arr[i]){
                int left = i-1;
                int right = i+1;

                while(left > 0 && arr[left -1] < arr[left]) left--;

                while(right < n-1 && arr[right] > arr[right +1] ) right++;

                int len = right - left +1;

                max = Math.max(max, len);
                i = right;

            }else {
                i++;
            }
        }
        return max;
    }
}