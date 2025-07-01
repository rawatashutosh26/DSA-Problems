// User function Template for Java

class Solution {
    public static String betterString(String s1, String s2) {
        // Code here
        if (s1 == null || s1.isEmpty()) return s2;
        if (s2 == null || s2.isEmpty()) return s1;
        int a = allpossible(s1);
        int b = allpossible(s2);
        if(a >= b){
            return s1;
        }else{
            return s2;
        }
    }
    public static int allpossible(String str){
        Map<Character, Integer> map = new HashMap<>();
        int n = str.length();
        int[] dp = new int[n+1];
        
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            dp[i] = 2*dp[i-1];
            
            if(map.containsKey(str.charAt(i-1))){
                dp[i] = dp[i] - dp[map.get(str.charAt(i-1))];
            }
            map.put(str.charAt(i-1),(i-1));
        }
        return dp[n];
    }
    
}