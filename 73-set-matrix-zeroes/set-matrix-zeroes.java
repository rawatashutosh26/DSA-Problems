class Solution {
    public void setZeroes(int[][] matrix) {
        int a = 0;
        int b = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row(matrix, i);
                    column(matrix, j);
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == -189){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public int[][] row(int[][] mat,int a){
        for(int i = 0; i < mat[0].length; i++){
            if(mat[a][i] != 0){
                mat[a][i] = -189;
            }
        }
        return mat;
    }
    public int[][] column(int[][] mat,int a){
        for(int i = 0; i < mat.length; i++){
            if(mat[i][a] != 0){
                mat[i][a] = -189;
            }
        }
        return mat;
    }
}