class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==target){
                    count++;;
                }
            }
        }
        if(count>0){
            return true;
        }
        else{
            return false;
        }
    }
}
