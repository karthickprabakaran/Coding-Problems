class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
        int n = intervals.length;
        List<int[]> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            if(list.isEmpty() || intervals[i][0] > list.get(list.size()-1)[1]){
                list.add(intervals[i]);
            }else{
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1], intervals[i][1]);
            }
        }

        return list.toArray(new int[list.size()] [] );
        
    }
}