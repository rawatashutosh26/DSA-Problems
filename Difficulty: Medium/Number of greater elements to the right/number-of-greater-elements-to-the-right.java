
class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {
        // code here
        int n = arr.length;
        int[] arr1 = new int[indices.length];
        
        for(int i = 0; i < indices.length; i++){
            int a = 0;
            int b = indices[i];
            int c = arr[b];
            for(int j = b; j < n; j++){
                if(arr[j] > c){
                    a++;
                }
            }
            arr1[i] = a;
            
        }
        return arr1;
    }
}
