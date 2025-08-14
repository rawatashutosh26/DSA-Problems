class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> minst;
    public MinStack() {
        st = new Stack<>();
        minst = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty() || val <= minst.peek()){
            minst.push(val);
        }
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        if(st.peek().equals(minst.peek())){
            st.pop();
            minst.pop();
        }else{
            st.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        if(minst.isEmpty()){
            return Integer.MAX_VALUE;
        }
        return minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */