class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1;
        int high = getmax(nums);
        int a = high;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(total(nums, mid) <= threshold){
                a = mid;
                high = mid - 1;
            }else{
                low = mid + 1;   
            }
        }
        return a;
    }
    public int total(int[] nums, int mid){
        int a = 0;
        for(int i = 0; i < nums.length; i++){
            a += (nums[i]+mid-1)/mid;
        }
        return a;

    }
    public int getmax(int[] nums){
        int a = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > a){
                a = nums[i];
            }
        }
        return a;
    }
}