class Solution {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1000000007;
        int n = arr.length;
        long sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || arr[stack.peek()] >= arr[i])) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;
                
                long count = (mid - left) * (right - mid) % MOD;
                sum = (sum + arr[mid] * count) % MOD;
            }
            stack.push(i);
        }
        
        return (int) sum;
    }
    
}