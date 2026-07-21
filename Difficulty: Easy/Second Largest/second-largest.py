class Solution:
    def getSecondLargest(self, arr):
        # code here
        a = arr[0]
        b = -1
        for i in range(1, len(arr)):
            if arr[i] > b :
                if arr[i] > a:
                    b = a
                    a = arr[i]
                elif arr[i] == a:
                    continue
                else:
                    b = arr[i]
        return b