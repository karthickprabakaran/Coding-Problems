class Solution {
    public int numberOfSteps(int num) {
        
        return count(num,0);
    }

    private static int count(int n, int cnt)
    {
        if(n<1) return cnt;

        if(n%2 == 0){
            return count(n/2, cnt+1);
        }

        return count(n-1,cnt+1);
    }
}