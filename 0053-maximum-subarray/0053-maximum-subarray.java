class Solution {
    public int maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
             sum += arr[i];
            max = Math.max(sum, max);
            if(sum < 0)
            {
                sum  = 0;
            }

        }

        return max;

    }
}