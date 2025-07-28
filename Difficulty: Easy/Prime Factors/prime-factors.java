class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        if(isprime(n)){
            arr.add(n);
            return arr;
        }
        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
                if(isprime(i)){
                    arr.add(i);
                }
            }
        }
        return arr;
    }
    public static boolean isprime(int n){
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}