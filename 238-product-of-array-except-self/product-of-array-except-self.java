class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = 1;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i-1] * nums[i-1];
        }

        int a = 1;
        for(int j = n-1; j >= 0; j--){
            arr[j] = arr[j] * a;
            a *= nums[j];
        }
        return arr;
    }
}