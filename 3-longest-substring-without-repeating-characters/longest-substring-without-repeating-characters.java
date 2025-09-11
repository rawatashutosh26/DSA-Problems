class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        List<Character> arr = new ArrayList<>(); 
        int n = s.length();
        while(j < n){
            if(!arr.contains(s.charAt(j))){
                arr.add(s.charAt(j));
                j++;
                max = Math.max(max, arr.size());
            }else{
                arr.remove(Character.valueOf(s.charAt(i)));
                i++;
            }
        }
        return max;
    }
}