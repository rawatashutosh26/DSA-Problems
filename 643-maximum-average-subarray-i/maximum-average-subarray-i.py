class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        n = len(nums)
        c = 0
        for i in range(k):
            c += nums[i]
        a = c/k
        b = 0
        for j in range(k,n):
            c-= nums[b]
            b += 1
            c += nums[j]
            a = max(a, c/k)
        return a
            