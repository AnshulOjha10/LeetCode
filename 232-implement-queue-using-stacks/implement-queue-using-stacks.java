class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {

        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {

        while (s2.size() != 0) {
            s1.push(s2.pop());
        }

        s2.push(x);

        while (s1.size() != 0) {
            s2.push(s1.pop());
        }

    } //now s2 is our top stack 

    public int pop() {
        if (s2.size() != 0) {
            return s2.pop();
        }

        return -1;
    }

    public int peek() {
        if (s2.size() != 0) {
            return s2.peek();
        }

        return -1;
    }

    public boolean empty() {
        if (s2.size() == 0) {
            return true;
        }

        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */