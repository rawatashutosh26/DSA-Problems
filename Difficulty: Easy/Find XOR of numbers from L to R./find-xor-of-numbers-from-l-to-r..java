// User function Template for Java

class Solution {
    public static int findXOR(int l, int r) {
        return xor(l-1) ^ xor(r);
    }
    public static int xor(int n){
        int a = n % 4;
        switch(a){
            case 0: return n;
            case 1: return 1;
            case 2: return n+1;
            case 3: return 0;
            default: return 0;
        }
    }
}