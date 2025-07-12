// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        int index = i-1;
        int bit = (num >> index) & 1;
        int set = num | (1 << index);
        int clear = num & ~(1 << index);
        System.out.print(bit + " " + set+ " " + clear);
    }
}
