// User function Template for Java

class Solution {
    static String postToInfix(String s) {
        // code here
        int n = s.length();
        Stack<String> st = new Stack<>();
        int i = 0;
        while(i <= n-1){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
            (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
            (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                st.push(String.valueOf(s.charAt(i)));
            }else{
                String t2 = st.pop();
                String t1 = st.pop();
                String str = "(" + t1 + s.charAt(i) + t2 + ")";
                st.push(str);
            }
            i++;
        }
        return st.peek();
    }
}
