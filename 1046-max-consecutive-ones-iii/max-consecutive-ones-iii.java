class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int a = 0;
            int b = 0;
            for(int j = i; j < n; j++){
                if(nums[j] == 0){
                    if(a < k){
                        a++;
                        b++;
                    }else{
                        break;
                    }
                }else{
                    b++;
                }
                
            }
            max = Math.max(max,b);
        }
        return max;
    }
}