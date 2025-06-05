class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int c = 1;
        int b = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }else if(nums[i] == nums[i-1]+1){
                b++;
            }else{
                b = 1;
            }
            c = Math.max(c,b);
            // for(int j = i+1; j < n; j++){
            //     if(nums[j] == a || nums[j] == nums[j-1]){
            //        continue;
            //     }else if(nums[j] == ++a){
            //         b++;
            //     }else{
            //         break;
            //     }
            // }

            c = Math.max(c, b);
        }
        return c;
    }
}