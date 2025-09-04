class Solution {
    public int maximalRectangle(char[][] matrix) {
        int cols = matrix[0].length;
        int maxArea = 0;
        int[] heights = new int[cols];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == '1'){
                    heights[j] += 1;
                }else{
                    heights[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, largest(heights));
        }
        return maxArea;
    }
    private int largest(int[] heights){
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        for(int i = 0; i <= n; i++){
            int h = (i==n) ? 0 : heights[i];
            while(!st.isEmpty() && h < heights[st.peek()]){
                int height = heights[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                maxArea = Math.max(maxArea, height*width);
            }
            st.push(i);
        }
        return maxArea;
    }
}