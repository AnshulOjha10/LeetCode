class MinStack {
    Stack<Integer> sc = new Stack<>();
    Stack<Integer> min = new Stack<>();

    // public MinStack() {
    //     MinStack sc = new Stack();
    //     MinStack min = new Stack();
    // }
    
    public void push(int value) {
        sc.push(value);
        if(min.isEmpty() || min.peek() >= value){
            min.push(value);
        }
    }
    
    public void pop() {

        if(sc.isEmpty()){
    return;
}
        int top = sc.pop();
        if(top == min.peek()){
            min.pop();             
        }
    }
    
    public int top() {

   return sc.peek();

    }
    
    public int getMin() {


      return min.peek();


        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */