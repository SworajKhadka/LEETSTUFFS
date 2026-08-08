class MinStack {

    Stack<Long> stack;
    long min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {

        if (stack.isEmpty()) {
            stack.push((long) val);
            min = val;
        }
        else if (val < min) {
            long encoded = 2L * val - min;
            stack.push(encoded);
            min = val;
        }
        else {
            stack.push((long) val);
        }
    }

    public void pop() {

        long top = stack.pop();

        if (top < min) {
            min = 2L * min - top;
        }
    }

    public int top() {

        long top = stack.peek();

        if (top < min) {
            return (int) min;
        }

        return (int) top;
    }

    public int getMin() {
        return (int) min;
    }
}