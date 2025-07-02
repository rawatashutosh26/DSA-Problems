class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        return check(arr, sum, 0);
    }
    public static boolean check(int[] arr, int sum, int a){
        if(sum == 0){
            return true;
        }
        
        if(a >= arr.length || sum < 0){
            return false;
        }
        if(check(arr, sum - arr[a], a+1)){
            return true;
        }
        
        return check(arr, sum, a+1);
    }
}