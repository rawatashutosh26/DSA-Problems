class Solution {
    public long subArrayRanges(int[] nums) {
        long sum = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int l = nums[i];
            int s = nums[i];
            for(int j = i+1; j < n; j++){
                l = Math.max(l,nums[j]);
                s = Math.min(s, nums[j]);
                sum += l-s;
            }
            
        }
        return sum;
    }
}
    