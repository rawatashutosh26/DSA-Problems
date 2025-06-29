class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        allpossible(arr, new ArrayList<>(), 0, nums);
        return arr;
        
    }
    public void allpossible(List<List<Integer>> arr, List<Integer> arr1, int a, int[] nums){
        arr.add(new ArrayList<>(arr1));

        for(int i = a; i < nums.length; i++){
            arr1.add(nums[i]);
            allpossible(arr, arr1, i + 1, nums);
            arr1.remove(arr1.size() - 1);
        }
    }
}