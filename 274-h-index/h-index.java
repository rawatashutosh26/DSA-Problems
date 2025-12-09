class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] arr = new int[n+1];

        for(int i : citations){
            if(i >= n){
                arr[n]++;
            }else{
                arr[i]++;
            }
        }
        int a = 0;
        for(int j = n; j>= 0; j--){
            a += arr[j];
            if(a >= j){
                return j;
            }
        }
        return 0;
    }
}