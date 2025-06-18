class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        int sign = 1;
        long result = 0;

        while(i<n && s.charAt(i) == ' '){
            i++;
        }

        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }

        while(i < n && Character.isDigit(s.charAt(i))){
            result = result*10 + (s.charAt(i) - '0');

            if(sign == 1 && result > Integer.MAX_VALUE){
                result = Integer.MAX_VALUE;
                break;
            }
            if(sign == -1 && result > (long)Integer.MAX_VALUE + 1){
                result = Integer.MIN_VALUE;
                break;
            }
            i++;
        }
        return (int)(sign * result);
    }
}