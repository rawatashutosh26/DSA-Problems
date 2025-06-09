class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = getmax(weights);
        int high = getsum(weights);
        int a = high;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(getday(weights, mid) <= days){
                a = mid;
                high = mid - 1;
            // }else if(getday(weights, mid) > days){
            //     low = mid + 1;
            // }else{
                // high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return a;
    }
    public int getday(int[] arr, int d){
        int a = 1;
        int b = 0;
        for(int i = 0; i < arr.length; i++){
            if(b + arr[i] > d){
                a++;
                b = 0;
            }
            b += arr[i];
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
    public int getsum(int[] arr){
        int a = 0;
        for(int i = 0; i < arr.length; i++){
            a += arr[i];
        }
        return a;
    }
}
