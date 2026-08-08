class MinStack {

    int[] stack;
    int[] minStack;
    int top;

    public MinStack() {
        stack = new int[10];
        minStack = new int[10];
        top = -1;
    }

    public void push(int value) {

        // Resize if array is full
        if (top == stack.length - 1) {
            int newSize = stack.length * 2;

            int[] newStack = new int[newSize];
            int[] newMinStack = new int[newSize];

            for (int i = 0; i <= top; i++) {
                newStack[i] = stack[i];
                newMinStack[i] = minStack[i];
            }

            stack = newStack;
            minStack = newMinStack;
        }

        top++;
        stack[top] = value;

        if (top == 0) {
            minStack[top] = value;
        } else {
            minStack[top] = Math.min(value, minStack[top - 1]);
        }
    }

    public void pop() {
        top--;
    }

    public int top() {
        return stack[top];
    }

    public int getMin() {
        return minStack[top];
    }
}