#User function Template for python3

class Solution:
    ##Complete this function
    def searchInSorted(self,arr, k):
        #Your code here
        p = 0
        n = len(arr)
        q = n-1
        while(p<=q):
            mid = (p+q)//2
            if arr[mid] == k:
                return True
            elif arr[mid] > k:
                q = mid - 1
            else:
                p = mid + 1
        return False