class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i >= 0){
            int j = nums.length - 1;
            while(j >= 0 && nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        sortarr(nums,i+1);
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sortarr(int[] arr,int i){
        int n = arr.length -1;
        while(i < n){
            swap(arr, i, n);
            i++;
            n--;
        }
    }

}