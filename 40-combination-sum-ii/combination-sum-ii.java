class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(candidates);
        allcombination(arr, candidates, target, new ArrayList<>(), 0);
        return arr;
    }
    public static void allcombination(List<List<Integer>> arr, int[] candidates, int target, List<Integer> arr1, int a){
        if(target == 0){
            arr.add(new ArrayList<>(arr1));
            return;
        }
        
        for(int i = a; i < candidates.length; i++){
            if(i > a && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i] > target){
                break;
            }
            arr1.add(candidates[i]);
            allcombination(arr, candidates, target-candidates[i], arr1, i+1);
            arr1.remove(arr1.size() - 1);
        }
        
    }
}