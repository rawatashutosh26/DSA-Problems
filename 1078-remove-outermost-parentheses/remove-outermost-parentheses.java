class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        int a = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                if(a > 0){
                    str.append(ch);
                }
                a++;
            }else{
                a--;
                if(a > 0){
                    str.append(ch);
                }
            }
        }
        return str.toString(); 
        
    }
}