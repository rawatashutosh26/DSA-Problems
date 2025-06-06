class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int n1 = matrix.length;
        int n2 = matrix[0].length;
        int a = 0;
        int b = 0;
        while(n1 > 0 && n2 > 0){
            for(int i = b; i < n2+b; i++){
                arr.add(matrix[a][i]); 
            }
            for(int i = a+1; i <a+n1; i++){
                arr.add(matrix[i][b+n2-1]);
            }
            if(n1>1){
                for(int i = b+n2-2; i >= b; i--){
                    arr.add(matrix[a+n1-1][i]);
                }
            }
            if(n2>1){
                for(int i = a+n1-2; i > a; i--){
                    arr.add(matrix[i][b]);
                }
            }
            a++;
            b++;
            n1 -= 2;
            n2 -= 2;
        }
        return arr;
    }
}