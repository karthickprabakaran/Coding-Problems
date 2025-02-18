//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNumber(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
     int missingNumber(int arr[]) {
        // code here
        int sumArr=0;
        int totSum=0;
      
        for(int i:arr){
            sumArr+=i;
        }
        int maxi=arr.length+1;
        for(int i=1;i<=maxi;i++){
            totSum+=i;
        }
        
        return totSum-sumArr;
    }
}