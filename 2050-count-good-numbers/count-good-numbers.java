class Solution {
    public int countGoodNumbers(long n) {
        final int MOD = 1000000007;
        long a = (pow(5, even(n), MOD) * pow(4, odd(n), MOD)) % MOD;
        return (int)a;
    }
    
    public long even(long n) {
        return (n + 1) / 2;
    }
    
    public long odd(long n) {
        return n / 2;
    }
    
    private long pow(long base, long exp, int mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
