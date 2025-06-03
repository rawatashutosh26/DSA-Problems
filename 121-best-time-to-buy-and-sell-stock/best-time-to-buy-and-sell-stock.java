class Solution {
    public int maxProfit(int[] prices) {
        int a = Integer.MAX_VALUE;
        int b = 0;
        int n = prices.length;
        for(int i = 0; i < n ;i++){
            if(prices[i] < a){
                a = prices[i];
            }else{
                b = Math.max(b, prices[i]- a);
            }
        }
        return b;
    }
}