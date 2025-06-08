class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = getmax(piles);
        int a = high;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(totaltime(piles, mid) <= h){
                a = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return a;
    }
    public long totaltime(int[] piles, int mid){
        long a = 0;
        for(int i = 0; i < piles.length; i++){
            a += (piles[i]+mid-1)/mid;
        }
        return a;
    }
    public int getmax(int [] piles){
        int a = piles[0];
        for(int i = 1; i < piles.length; i++){
            if(piles[i] > a){
                a = piles[i];
            }
        }
        return a;
    }
}