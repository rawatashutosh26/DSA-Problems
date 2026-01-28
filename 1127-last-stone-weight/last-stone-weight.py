import heapq
class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        hq = []
        for i in stones:
            heapq.heappush(hq,-i)
        while(len(hq)>1):
            a = -heapq.heappop(hq)
            b = -heapq.heappop(hq)
            if a != b:
                heapq.heappush(hq,b-a)
        if len(hq)>0:
            return -hq[0]
        else:
            return 0
