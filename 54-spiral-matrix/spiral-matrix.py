class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        r = len(matrix)
        c = len(matrix[0])

        r0, r1 = 0,r-1
        c0, c1 = 0, c-1
        arr = []
        while(len(arr) < r*c):
            for i in range(c0,c1+1):
                arr.append(matrix[r0][i])    
            r0 += 1
            if(len(arr) == r*c):
                break
            for j in range(r0,r1+1):
                arr.append(matrix[j][c1])
            c1 -= 1
            if(len(arr) == r*c):
                break
            for k in range(c1,c0-1,-1):
                arr.append(matrix[r1][k])
            r1 -= 1
            if(len(arr) == r*c):
                break
            for l in range(r1,r0-1,-1):
                arr.append(matrix[l][c0])
            c0 += 1

        return arr
        
            

