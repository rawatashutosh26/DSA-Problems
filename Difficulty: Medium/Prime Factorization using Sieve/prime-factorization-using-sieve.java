// User function Template for Java

class Solution {
    // You must implement this function
    private static final int MAX_N = 200001;
    private static final int[] arr = new int[MAX_N];
    static void sieve() {
        for(int i = 2; i < MAX_N; i++){
            if(arr[i] == 0){
                for(int j = i; j < MAX_N; j+= i){
                    if(arr[j] == 0){
                        arr[j] = i;
                    }
                }
            }
        }
    }

    static List<Integer> findPrimeFactors(int N) {
        // code here
        sieve();
        List<Integer> arr1 = new ArrayList<>();
        while(N>1){
            arr1.add(arr[N]);
            N /= arr[N];
        }
        return arr1;
    }
}
