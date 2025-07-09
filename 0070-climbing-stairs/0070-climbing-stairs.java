class Solution {
    public int climbStairs(int n) {

        int one = 2;
        int two =1;
        int all = 0;

        if(n == 2) return 2;
        if(n ==1 ) return 1;

        for(int i=3;i<=n;i++){
            all = one + two;
            two = one;
            one = all;
        }

        return all;
        
    }
}