class Solution {
    public static int countSetBits(int n) {
        // code here
        int count = 0;
        for (int i = 0; (1 << i) <= n; i++) {
            int totalPairs = n + 1; 
            int completePairs = totalPairs / (1 << (i + 1));
            count += completePairs * (1 << i);
            count += Math.max(0, totalPairs % (1 << (i + 1)) - (1 << i));
        }
        return count;
    }
}