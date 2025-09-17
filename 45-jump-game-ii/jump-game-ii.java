class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0; i < n-1; i++){
            a = Math.max(a, i+nums[i]);

            if(i == c){
                b++;
                c = a;
            }
        }
        return b;
    }
}