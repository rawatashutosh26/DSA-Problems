/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        int n = s.size();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.pop();
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            s.push(arr[i]);
        }
        return s;
    }
}