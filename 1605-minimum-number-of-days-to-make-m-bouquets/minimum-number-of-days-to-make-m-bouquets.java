class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long n = bloomDay.length;
        long z = m*k;
        if(n < z){
            return -1;
        }
        int a = -1;
        int low = getmin(bloomDay);
        int high = getmax(bloomDay);
        while(low <= high){
            int mid = low + (high - low)/2;
            
            if(total(bloomDay, mid, k) >= m){
                a = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return a;
    }
    public int total(int[] piles, int mid, int k){
        int count = 0;
        int a = 0;
        for(int i = 0; i < piles.length;i++){
            if(piles[i] <= mid){
                count++;
                if(count == k){
                    a++;
                    count = 0;
                }
            }else{
                count = 0;
            }
            
        }
        return a;
        
    }
    public int getmin(int[] arr){
        int a = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < a){
                a = arr[i];
            }
        }
        return a;
    }
    public int getmax(int[] arr){
        int a = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > a){
                a = arr[i];
            }
        }
        return a;
    }
}