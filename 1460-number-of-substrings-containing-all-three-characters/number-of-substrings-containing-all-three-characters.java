class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr = new int[3];
        int i = 0;
        int a = 0;
        int n = s.length();
        for(int j = 0; j < n; j++){
            arr[s.charAt(j) - 'a']++;

            while(arr[0] > 0 && arr[1] > 0 && arr[2] > 0){
                a += n - j;
                arr[s.charAt(i)-'a']--;
                i++;
            }
        }
        return a;
    }
}