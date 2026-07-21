class Solution:
    def largest(self, arr):
        # code here
        n = len(arr)
        a = arr[0]
        for i in range(1,n):
            if(arr[i]>a):
                a = arr[i]
        return a
