class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            if(mat[i][j] == 1){
                i++;
            }else{
                j--;
            }
        }
        int a = i;
        for(int k = 0; k < n; k++){
            if(k != a){
                if(mat[a][k] == 1){
                    return -1;
                }
                if(mat[k][a] == 0){
                    return -1;
                }
            }
        }
        return a;
    }
}