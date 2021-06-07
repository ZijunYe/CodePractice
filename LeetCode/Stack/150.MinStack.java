// 155.Min stack
class MinStack {

    /** initialize your data structure here. */
    private Stack<Integer>data; // when you create a stack that inside object specify need to be capital
    private Stack<Integer>min;

    /** initialize your data structure here. */
    public MinStack() {
        data = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int x) {
        data.push(x);
        if (min.isEmpty()){
            min.push(x);
        }
        else if (x < min.peek()){
               	
            min.push(x);
        }
    }
    
    public void pop() {
        data.pop();
        min.pop();
    }
    
    public int top() {
        return data.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */