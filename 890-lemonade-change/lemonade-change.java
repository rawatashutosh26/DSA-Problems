class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int a = 0;
        int x = 0;
        for(int i = 0; i < n; i++){
            if(bills[i] == 5){
                a++;
            }else if(bills[i] == 10){
                if(a == 0){
                    return false;
                }
                a--;
                x++;
            }else{
                if(a>0 && x >0){
                    a--;
                    x--;
                }else if(a>= 3){
                    a -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}