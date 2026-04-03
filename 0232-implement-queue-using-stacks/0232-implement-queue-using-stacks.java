class MyQueue {
    private Stack<Integer> s1; // inbox  - push here
    private Stack<Integer> s2; // outbox - pop from here

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    // Always push to s1 — O(1)
    public void push(int x) {
        s1.push(x);
    }

    // Transfer s1 → s2 only when s2 is empty, then pop — amortized O(1)
    public int pop() {
        transfer();
        return s2.pop();
    }

    // Same as pop but don't remove — amortized O(1)
    public int peek() {
        transfer();
        return s2.peek();
    }

    // Empty only if both stacks are empty — O(1)
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    // Core trick: reverse s1 into s2 to restore FIFO order
    private void transfer() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }
}