class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int n = n1 + n2;
        int a = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n1; i++){
            arr[a++] = nums1[i];
        }
        for(int i = 0; i < n2; i++){
            arr[a++] = nums2[i];
        }
        Arrays.sort(arr);
        if(n%2 == 0){
            return (double)(arr[n/2-1] + arr[n/2])/2;
        }else{
            return arr[n/2];
        }
    }
}