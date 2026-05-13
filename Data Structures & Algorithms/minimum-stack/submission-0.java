class MinStack {
    Stack<Integer> stack;
    Stack<Integer> stack2;

    public MinStack() {
        stack = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (stack2.isEmpty() || stack2.peek() >= val) {
            stack2.push(val);
        }
    }

    public void pop() {
        int s = stack.pop();
        if (!stack2.isEmpty() && s == stack2.peek()) {
            stack2.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stack2.peek();
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