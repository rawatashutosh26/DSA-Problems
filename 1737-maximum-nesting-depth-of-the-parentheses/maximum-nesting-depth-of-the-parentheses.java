class Solution {
    public int maxDepth(String s) {
        int a = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                a++;
            }
            if(s.charAt(i) == ')'){
                a--;
            }
            max = Math.max(a, max);

        }
        return max;
    }
}