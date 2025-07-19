class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        Arrays.sort(start);
        Arrays.sort(end);
        int k=0,n=end.length;
        int ans=0;
        for(int i=0;i<end.length;i++){
            while(k<start.length&&start[k]<end[i]) k++;
            ans=Math.max(ans,k-i);
        }
        return ans;
    }
}