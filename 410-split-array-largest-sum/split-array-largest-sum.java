class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        if(k > n){
            return -1;
        }
        int low = getmax(nums);
        int high = getsum(nums);
        int a = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(getminpage(nums, mid) <= k){
                a = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return a;
    }
    public int getminpage(int[] arr, int mid){
        int n = arr.length;
        int a = 1;
        int b = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > mid){
                return Integer.MAX_VALUE;
            }
            if(b + arr[i] > mid){
                a++;
                b = arr[i];
            }else{
                b+= arr[i];
            }
        }
        return a;
    }
    public int getmax(int[] arr){
        int n = arr.length;
        int a = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > a){
                a = arr[i];
            }
        }
        return a;
    }
    public int getsum(int[] arr){
        int n = arr.length;
        int a = 0;
        for(int i = 0; i < n; i++){
            a += arr[i];
        }
        return a;
    }
}