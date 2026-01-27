class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        n = len(s)
        a = set({})
        i, j = 0, 1
        if n <= 1:
            return n
        a.add(s[0])
        x = 1
        while j < n:
            while s[j] in a:
                a.discard(s[i])
                i += 1
            a.add(s[j])
            j += 1
            x = max(x,(j-i))
        return x

        