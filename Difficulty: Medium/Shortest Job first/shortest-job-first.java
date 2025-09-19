// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int n = bt.length;
        int a = 0;
        int b = 0;
        for(int i = 0; i < n-1; i++){
            a += bt[i];
            b += a;
        }
        return b/n;
    }
}
