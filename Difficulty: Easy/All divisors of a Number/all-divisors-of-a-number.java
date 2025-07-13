class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        // if(isprime(n)){
        //     arr.add(1);
        //     arr.add(n);
        // }else{
        //     for(int i = 1; i <= n; i++){
        //         if(n % i == 0){
        //             arr.add(i);
        //         }
        //     }
        // }
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                arr.add(i);
                if(i != n/i){
                    arr.add(n/i);
                }
            }
        }
        arr.sort(null);
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        
    }
    // public static boolean isprime(int n){
    //     if(n <= 1){
    //         return false;
    //     }
    //     for(int i = 2; i <= Math.sqrt(n); i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
