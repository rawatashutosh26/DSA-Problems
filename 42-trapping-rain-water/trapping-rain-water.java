class Solution {
    public int trap(int[] arr) {
        int  n = arr.length;
        int lm = 0;
        int rm = 0;
        int total = 0;
        int l = 0;
        int r = n-1;
        while(l < r){
            if(arr[l] <= arr[r]){
                if(lm > arr[l]){
                    total += lm - arr[l];
                }else{
                    lm = arr[l];
                }
                l++;
            }else{
                if(rm > arr[r]){
                    total += rm - arr[r];
                }else{
                    rm = arr[r];
                }
                r--;
            }
        }
        return total;
    }
}