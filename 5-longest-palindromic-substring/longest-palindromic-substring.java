class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        int x = 0, y = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (palindrome(s, i, j)) {
                    int len = j - i + 1;
                    if (len > max) {
                        max = len;
                        x = i;
                        y = j + 1;
                    }
                }
            }
        }

        return s.substring(x, y);
    }

    public boolean palindrome(String s, int a, int b) {
        while (a < b) {
            if (s.charAt(a) != s.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
