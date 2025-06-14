class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1 != n2){
            return false;
        }
        int[] arrS = new int[256];
        int[] arrT = new int[256];
        for(int i = 0; i < n1; i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if(arrS[chS] != arrT[chT]){
                return false;
            }
            arrS[chS] = i + 1;
            arrT[chT] = i + 1;
        }
        return true;
    }
}