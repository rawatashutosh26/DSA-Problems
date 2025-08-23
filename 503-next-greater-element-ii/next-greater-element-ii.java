class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n*2];
        for(int i = 0; i < 2*n ; i++){
            arr[i] = nums[i%n];
        }
        
        for(int i = 0; i < n; i++){
            int a = nums[i];
            int j = i;
            // while(j < 2*n){
            //     if(arr[j] == a){
            //         break;
            //     }
            //     j++;
            // }
            for(int k = j+1; k < 2*n; k++){
                if(arr[k] > a){
                    a = arr[k];
                    break;
                }
            }
            if(a == nums[i]){
                a = -1;
            }
            nums[i] = a;
        }
        return nums;
    }
}