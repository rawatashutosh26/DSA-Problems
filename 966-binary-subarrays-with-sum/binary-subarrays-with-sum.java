class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int b = 0;
        for(int i = 0; i < n; i++){
            int j = i;
            int a = 0;
            while(a <= goal && j < n){
                a += nums[j++];
                if(a == goal){
                    b++;
                }
            }
        }
        return b;
    }
}