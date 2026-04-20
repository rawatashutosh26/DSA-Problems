class Solution:
    def findUnion(self, a, b):
        # code here 
        arr =[]
        i , j = 0, 0
        n, m = len(a), len(b)
        l = None
        while i < n and j < m:
            if(a[i] < b[j]):
                if l != a[i]:
                    arr.append(a[i])
                    l = a[i]
                i+=1
            elif(b[j]<a[i]):
                if l != b[j]:
                    arr.append(b[j])
                    l = b[j]
                j+=1
            else:
                if l != a[i]:
                    arr.append(a[i])
                    l = a[i]
                i+=1
                j+=1
        while(i<n):
            if(l != a[i]):
                arr.append(a[i])
                l = a[i]
            i+=1
        while(j<m):
            if(l != b[j]):
                arr.append(b[j])
                l = b[j]
            j += 1
        return arr
                