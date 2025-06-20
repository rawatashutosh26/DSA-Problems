import java.util.*;

class Solution {
    int countSubstr(String s, int k) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int unique = 0;

            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'a';
                if (freq[idx] == 0) unique++;
                freq[idx]++;
                
                if (unique == k) count++;
                else if (unique > k) break;
            }
        }

        return count;
    }
}
