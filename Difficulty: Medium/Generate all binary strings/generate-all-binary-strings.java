// User function Template for Java

class Solution {
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> ans = new ArrayList<>();
        solve(n, ans, 0, "", false);
        return ans;
    }
    public static void solve(int n, List<String> ans, int ind, String temp, boolean flag){
        if(ind == n){
            ans.add(temp);
            return;
        }
        
        if(flag == false){
            solve(n, ans, ind+1, temp + "0", false);
            solve(n, ans, ind+1, temp + "1", true);
        }else{
            solve(n, ans, ind+1, temp + "0", false);
        }
    }
}
