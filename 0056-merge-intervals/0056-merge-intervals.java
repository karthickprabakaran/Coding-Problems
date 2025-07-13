class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        res.add(intervals[0]);
        int n = intervals.length;
        for(int i=1;i<n;i++){
            int[] prev = res.get(res.size() -1);
            int[] current = intervals[i];
            if(current[0] <= prev[1]){
                prev[1] = Math.max(prev[1], current[1]);
            }else{
                res.add(current);
            }
        }

        return res.toArray(new int[res.size()][]);
        
    }
}