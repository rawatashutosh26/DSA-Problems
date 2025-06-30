class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        combination(arr, candidates, target, new ArrayList<>(), 0);
        return arr;
    }
    public void combination(List<List<Integer>> arr , int[] candidates, int target, List<Integer> arr1, int a){
        if(a == candidates.length){
            if(target == 0){
                arr.add(new ArrayList<>(arr1));
            }
            return;
        }

        if(candidates[a] <= target){
            arr1.add(candidates[a]);
            combination(arr, candidates, target- candidates[a], arr1, a);
            arr1.remove(arr1.size() - 1);
        }
        combination(arr, candidates, target, arr1, a+1);
    }
}