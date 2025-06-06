class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        for(int i = 0; i <n-1;){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }else{
                i += 2;
            }
        }
        if(n == 1){
            return nums[0];
        }
        return nums[n-1];
    }
}