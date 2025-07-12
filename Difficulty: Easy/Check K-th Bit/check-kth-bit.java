class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        int bit = (n >> k) & 1;
        
        return bit==1;
    }
}