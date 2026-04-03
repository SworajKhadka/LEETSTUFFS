class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        
    }
    
    public void push(int x) {
        //inorder to push, since queue is FIFO but we need LIFO so we have to copy remaining elements and add last elements to the front 
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();

        }
        q1.add(x);
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }
    
    public int pop() {
        int ans = q1.peek();
        q1.poll();
        return ans;

        
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */