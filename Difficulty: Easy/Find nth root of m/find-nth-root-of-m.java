// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        double c = Math.pow(m,1.0/n);
        int a = (int)Math.round(c);
        int b = (int)Math.pow(a,n);
        if(b == m){
            return a;
        }else{
            return -1;
            
        }
    }
}