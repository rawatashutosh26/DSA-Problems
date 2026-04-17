class Solution:
    def getSecondLargest(self, arr):
        # Code Here
        a1 = -1
        a2 = -1
        for i in range(0,len(arr)):
            if arr[i] > a1:
                a2 = a1
                a1 = arr[i]
            elif arr[i]>a2 and arr[i]!=a1:
                a2 = arr[i]
        
        return a2