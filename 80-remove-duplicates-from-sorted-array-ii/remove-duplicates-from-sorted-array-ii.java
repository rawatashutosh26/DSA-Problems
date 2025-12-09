class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }
        int a = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[a-2]){
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }
}