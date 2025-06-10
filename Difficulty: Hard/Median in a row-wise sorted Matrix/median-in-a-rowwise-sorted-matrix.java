// User function Template for Java

class Solution {
    int median(int mat[][]) {
        // code here
        int n1 = mat.length;
        int n2 = mat[0].length;
        int n = n1*n2;
        int[] arr = new int[n];
        int x = 0;
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2 ; j++){
                arr[x++] = mat[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[n/2];
    }
}