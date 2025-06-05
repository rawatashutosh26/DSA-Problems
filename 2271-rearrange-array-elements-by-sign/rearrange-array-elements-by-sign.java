class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] even = new int[n/2];
        int[] odd = new int[n/2];
        int a = 0;
        int b = 0;
        for(int i =0; i < n; i++){
            if(nums[i] < 0){
                odd[b++] = nums[i];
            }else{
                even[a++] = nums[i];
            }
        }
        int x = 0;
        int y = 0;
        for(int i = 0; i < n;){
            nums[i++] = even[x++];
            nums[i++] = odd[y++];
        }
        return nums;
    }
}