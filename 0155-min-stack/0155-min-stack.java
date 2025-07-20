class MinStack {

    Stack<Integer> stk = null;
    Stack<Integer> min = null;

    public MinStack() {
        stk = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(min.isEmpty()){
            min.push(val);
        } else{
            min.push(Math.min(min.peek(), val));
        }
    }
    
    public void pop() {
        stk.pop();
        min.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return min.peek();
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