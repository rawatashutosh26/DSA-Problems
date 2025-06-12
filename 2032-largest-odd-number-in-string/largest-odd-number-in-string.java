class Solution {
    public String largestOddNumber(String num) {
        while(num.length() > 0){
            int n = num.length();
            char ch = num.charAt(n - 1);
            if((ch - '0') % 2 == 1){
                return num;
            }else{
                num = num.substring(0, n - 1);
            }
        }
        return "";     
    }
}