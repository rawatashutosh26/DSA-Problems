class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int a = 0;
        int b = 0;
        int n = arr.length;
        int i = 0;
        int j = 0;
        while(i < n && j < n){
            if(arr[i] <= dep[j]){
                i++;
                a++;
                
                b = Math.max(b,a);
            }else{
                a--;
                j++;
            }
        }
        return b;
    }
}
