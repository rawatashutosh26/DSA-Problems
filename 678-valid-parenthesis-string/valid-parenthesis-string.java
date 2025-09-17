class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stO = new Stack<>();
        Stack<Integer> stS = new Stack<>();

        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                stO.push(i);
            }else if(s.charAt(i) == '*'){
                stS.push(i);
            }else{
                if(!stO.isEmpty()){
                    stO.pop();
                }else if(!stS.isEmpty()){
                    stS.pop();
                }else{
                    return false;
                }
            }
        }
        while(!stO.isEmpty() && !stS.isEmpty()){
            if(stO.peek() < stS.peek()){
                stO.pop();
                stS.pop();
            }else{
                return false;
            }
        }
        return stO.isEmpty();
    }
}