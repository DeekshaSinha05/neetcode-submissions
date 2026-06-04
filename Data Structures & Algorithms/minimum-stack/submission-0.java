class MinStack {
    Stack<int[]> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        int curMin = 0 ;
        if(stack.isEmpty())
            curMin=val;
        else {
            curMin = Math.min( stack.peek()[1], val);
        }
            stack.push(new int[]{val, curMin});
        
    }
    
    public void pop() {
        int[] element = stack.pop();
        
    }
    
    public int top() {
        return stack.peek()[0];
        
    }
    
    public int getMin() {
        return stack.peek()[1];
        
    }
}
