class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> arr = new ArrayList<>();
        allpossible(arr, k, n, new ArrayList<>(), 1);
        return arr;
    }
    public static void allpossible(List<List<Integer>> arr, int k, int n, List<Integer> arr1, int a){
        if(arr1.size() == k){
            if(n == 0){
                arr.add(new ArrayList<>(arr1));
                return;
            }
        }

        for(int i = a; i < 10; i++){
            arr1.add(i);
            allpossible(arr, k, n - i, arr1, i+1);
            arr1.remove(arr1.size() - 1);
        }

    }
}