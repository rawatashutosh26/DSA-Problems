class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        for(int i = 0; i < n; i++){
            int[] freq = new int[26];
            for(int j = i; j < n; j++){
                freq[s.charAt(j) - 'a']++;
                int a = getmax(freq) - getmin(freq);
                sum += a;
            }
        }
        return sum;
    }
    public int getmax(int[] freq){
        int max = 0;
        for(int i = 0; i < 26; i++){
            max = Math.max(max, freq[i]);
        }
        return max;
    }
    public int getmin(int[] freq){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                min = Math.min(min, freq[i]);
            }
        }
        return min;
    }
}