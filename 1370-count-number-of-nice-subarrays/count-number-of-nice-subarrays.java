class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        // int a = 0;
        // for(int i = 0; i < n; i++){
        //     int j = i;
        //     int b = 0;
        //     while(j < n && b <= k){
        //         if(nums[j++] % 2 == 1){
        //             b++;
        //         }
        //         if(b == k){
        //             a++;
        //         }
        //     }
        // }
        // return a;
        
        int a = 0;
        int b = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i : nums){
            if(i % 2 == 1){
                b++;
            }
            a += map.getOrDefault(b-k,0);
            map.put(b, map.getOrDefault(b,0)+1);
        }
        return a;
    }
}