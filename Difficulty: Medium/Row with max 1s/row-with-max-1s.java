// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int b = 0;
        int x = 0;
        for(int i = 0; i < arr.length; i++){
            int a = 0;
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 1){
                    a++;
                }
            }
            if(b < a){
                b = Math.max(b, a);
                x = i;
            }
        }
        return x;
    }
}