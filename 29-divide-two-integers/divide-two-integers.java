class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int a = 1;
        int b = 1;

        long ldividend = dividend;
        long ldivisor = divisor;

        if (ldividend < 0) {
            a = -1;
            ldividend = -ldividend;
        }
        if (ldivisor < 0) {
            b = -1;
            ldivisor = -ldivisor;
        }

        int result = 0;

        while (ldividend >= ldivisor) {
            int i = 0;
            while (ldividend >= (ldivisor << i)) {
                i++;
            }
            i--;
            ldividend -= (ldivisor << i);
            result += (1 << i);
        }

        return result * a * b;
    }
}
