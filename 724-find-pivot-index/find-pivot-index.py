class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total = sum(nums)
        l = 0
        n = len(nums)
        for i in range(n):
            r = total - nums[i] - l
            if r == l:
                return i
            l += nums[i]
        return -1