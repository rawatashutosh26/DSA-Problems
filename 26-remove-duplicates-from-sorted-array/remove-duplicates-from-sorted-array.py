class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        a = 1
        b = nums[0]
        for i in range(1,n):
            if(nums[i] != b):
                b = nums[i]
                nums[i] = nums[a]
                nums[a] = b
                a += 1
        return a