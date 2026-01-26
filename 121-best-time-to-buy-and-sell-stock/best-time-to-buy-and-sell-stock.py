class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n = len(prices)
        m = prices[0]
        p = 0
        for i in range(1,n):
            a = prices[i] - m
            p = max(a,p)
            m = min(m,prices[i])
        return p