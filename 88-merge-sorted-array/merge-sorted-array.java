class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0){
            for(int i = 0; i < m; i++){
                System.out.print(nums1[i]+ " ");
            }
            return;
        }

        for(int i = 0; i < n; i++){
            nums1[m+i] = nums2[i];
        }

        Arrays.sort(nums1, 0, m+n);
        for(int i = 0; i < m+n; i++){
            System.out.print(nums1[i] + " ");
        }
    }
}