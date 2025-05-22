// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
        // code here
        int cnt = 0;
        for(int i = arr.length -1; i>=0;i--)
        {
            if(arr[i] == 0){
                
            cnt++;
            
            }
            if(arr[i] == 1) break;
        }
        
        return cnt;
    }
}
