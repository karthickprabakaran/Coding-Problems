class Solution {
    public int climbStairs(int n) {

        if(n <=2) return n;

        int twoWays = 1;
        int oneWay = 2;
        int all = 0;
        for(int i=3;i<=n;i++){
             all = twoWays + oneWay;
            twoWays = oneWay;
            oneWay = all;
        }

        return all;
        
    }
}