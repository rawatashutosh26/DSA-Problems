// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n1 = a.length;
        int n2 = b.length;
        int n = n1 + n2;
        int[] arr = new int[n];
        int x = 0;
        for(int i = 0; i < n1; i++){
            arr[x++] = a[i]; 
        }
        for(int i = 0; i < n2; i++){
            arr[x++] = b[i];
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}