class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        a = a ^ b; 
        b = a ^ b;
        a = a ^ b;
        List<Integer> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        return arr;
    }
}