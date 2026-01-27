class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        a = 0
        s = nums[0]

        for i in nums:
            a += i
            if a > s:
                s = a
            if a < 0:
                a = 0
        return s