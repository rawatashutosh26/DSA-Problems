class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        for(int i = 0; i < n1; i++){
            int a = nums1[i];
            int j = 0;
            while( j < n2){
                if(nums2[j] == a){
                    break;
                }
                j++;
            }
            for(int k = j+1; k < n2; k++){
                if(nums2[k] > a){
                    a = nums2[k];
                    break;
                }
            }
            if( a == nums1[i]){
                a = -1;
            }
            nums1[i] = a;
        }
        return nums1;
    }
}