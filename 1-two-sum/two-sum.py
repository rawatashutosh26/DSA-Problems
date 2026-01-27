class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = len(nums)
        dict1 = {}
        for i in range(n):
            a = target - nums[i]
            if a in dict1:
                return [dict1[a], i]
            dict1[nums[i]] = i
    