class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int x = 0;
        for(int i = s.length()-1; i >= 0; i--){
            int y = value(s.charAt(i));
            if(y < x){
                total -= y; 
            }else{
                total += y;
            }
            x = y;
        }
        return total;
    }
    public int value(char ch){
        switch(ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}