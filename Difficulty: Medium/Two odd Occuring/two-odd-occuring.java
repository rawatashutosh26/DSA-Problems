class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        // code here
        ArrayList<Integer> arr1 = new ArrayList<>();
        int a = 1;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            
            if(arr[i] == arr[i+1]){
                a++;
            }else{
                if(a%2 == 1){
                    arr1.add(arr[i]);
                }
                a = 1;
            }
        }
        if (a % 2 == 1) {
            arr1.add(arr[arr.length - 1]);
        }
        arr1.sort(Comparator.reverseOrder());
        return new ArrayList<>(arr1.subList(0, Math.min(2, arr1.size())));
    }
}
