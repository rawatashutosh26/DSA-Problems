class Solution:
    def check(self, nums: List[int]) -> bool:
        n = len(nums)
        a = 0
        for i in range(0,n):
            if(nums[(i+1)%n]<nums[i%n]):
                a+=1
        if(a<=1):
            return True
        else:
            return False