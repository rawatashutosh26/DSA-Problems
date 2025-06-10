class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int[] arr = new int[2];
        if(mat.length == 1 && mat[0].length == 1){
            arr[0] = 0;
            arr[1] = 0;
            return arr;
        }
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(peakelement(mat, i, j)){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
    public boolean peakelement(int[][] mat, int i , int j){
        if(i > 0 && i < mat.length-1 && j > 0 && j < mat[0].length-1){
            if((mat[i-1][j] < mat[i][j]) && (mat[i+1][j] < mat[i][j]) &&
            (mat[i][j-1] < mat[i][j]) && (mat[i][j+1] < mat[i][j])){
                return true;
            }
        }else if(i == 0 && i < mat.length-1 && j > 0 && j < mat[0].length-1){
            if((mat[i+1][j] < mat[i][j]) &&
            (mat[i][j-1] < mat[i][j]) && (mat[i][j+1] < mat[i][j])){
                return true;
            }
        }else if(i > 0 && i == mat.length-1 && j > 0 && j < mat[0].length-1){
            if((mat[i-1][j] < mat[i][j]) &&
            (mat[i][j-1] < mat[i][j]) && (mat[i][j+1] < mat[i][j])){
                return true;
            }
        }else if(i > 0 && i < mat.length-1 && j == 0 && j < mat[0].length-1){
            if((mat[i-1][j] < mat[i][j]) && (mat[i+1][j] < mat[i][j]) &&
             (mat[i][j+1] < mat[i][j])){
                return true;
            }
        }else if(i > 0 && i < mat.length-1 && j > 0 && j == mat[0].length-1){
            if((mat[i-1][j] < mat[i][j]) && (mat[i+1][j] < mat[i][j]) &&
            (mat[i][j-1] < mat[i][j])){
                return true;
            }
        }else if (i == 0 && j == 0 && mat.length > 1 && mat[0].length > 1) {
            if ((mat[i + 1][j] < mat[i][j]) && (mat[i][j + 1] < mat[i][j])) {
                return true;
            }
        } else if (i == 0 && j == mat[0].length - 1 && mat.length > 1 && mat[0].length > 1) {
            if ((mat[i + 1][j] < mat[i][j]) && (mat[i][j - 1] < mat[i][j])) {
                return true;
            }
        } else if (i == mat.length - 1 && j == 0 && mat.length > 1 && mat[0].length > 1) {
            if ((mat[i - 1][j] < mat[i][j]) && (mat[i][j + 1] < mat[i][j])) {
                return true;
            }
        } else if (i == mat.length - 1 && j == mat[0].length - 1
         && mat.length > 1 && mat[0].length > 1) {
            if ((mat[i - 1][j] < mat[i][j]) && (mat[i][j - 1] < mat[i][j])) {
                return true;
            }
        }else if (mat.length == 1 && mat[0].length > 1) {
            if (j > 0 && j < mat[0].length - 1) {
                if (mat[i][j] > mat[i][j - 1] && mat[i][j] > mat[i][j + 1]) {
                    return true;
                }
            } else if (j == 0) {
                if (mat[i][j] > mat[i][j + 1]) {
                    return true;
                }
            } else if (j == mat[0].length - 1) {
                if (mat[i][j] > mat[i][j - 1]) {
                    return true;
                }
            }
        } else if (mat[0].length == 1 && mat.length > 1) {
            if (i > 0 && i < mat.length - 1) {
                if (mat[i][j] > mat[i - 1][j] && mat[i][j] > mat[i + 1][j]) {
                    return true;
                }
            } else if (i == 0) {
                if (mat[i][j] > mat[i + 1][j]) {
                    return true;
                }
            } else if (i == mat.length - 1) {
                if (mat[i][j] > mat[i - 1][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}