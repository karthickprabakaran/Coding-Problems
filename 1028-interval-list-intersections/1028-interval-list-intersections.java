class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        int left = 0;
        int right = 0;
        List<int[]> list = new ArrayList<>();

        while(left <firstList.length &&  right < secondList.length){
            int start = Math.max(firstList[left][0], secondList[right][0]);
            int end = Math.min(firstList[left][1], secondList[right][1]);

            if(start <= end){
                list.add(new int[] {start, end});
            }

            if(firstList[left][1] < secondList[right][1]){
                left++;
            }else{
                right++;
            }


        }

        return list.toArray(new int[list.size()][]);
        
    }
} 