class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {


        ArrayList<Integer> result = new ArrayList<>();

        if(matrix == null || matrix.length == 0) return result;

        int rowBegin = 0;
        int rowEnd = matrix.length -1;
        int colBegin = 0;
        int colEnd = matrix[0].length -1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){

            // traverse right
            for(int i = colBegin; i <= colEnd;i++){
                result.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            // TraverseDown
            for(int i= rowBegin; i <= rowEnd;i++)
            {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            // Traverse Left
            if(rowBegin <= rowEnd){
                for(int i=colEnd;i >= colBegin;i--){
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            // TraverseUp
            if(colBegin <= colEnd){
                for(int i=rowEnd;i >= rowBegin; i--){
                    result.add(matrix[i][colBegin]);
                }
            }

            colBegin++;

        }


        return result;
    }
}