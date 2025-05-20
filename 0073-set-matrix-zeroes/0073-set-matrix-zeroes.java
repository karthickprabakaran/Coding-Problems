class Solution {
    public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int cols = matrix[0].length;

        boolean[] rowZero = new boolean[row];
        boolean[] colZero = new boolean[cols];

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j] == 0){
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(rowZero[i] || colZero[j]){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}