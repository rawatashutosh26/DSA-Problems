class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = getMap();
        List<String> arr  = new ArrayList<>();
        if(digits.length() == 0){
            return arr;
        }
        solve(0, digits, "", arr, map);
        return arr;
    }
    public void solve(int a, String digits, String s, List<String> arr, Map<Character, String> map){
        if(a == digits.length()){
            arr.add(s);
            return;
        }
        for(char c : map.get(digits.charAt(a)).toCharArray()){
            String temp = new String(s);
            temp += c;
            solve(a+1, digits, temp, arr, map);
        }
    }

    private Map<Character, String> getMap(){
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        return map;
    }
}