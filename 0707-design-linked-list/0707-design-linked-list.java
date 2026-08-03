class MyLinkedList {
    Node head;
    int size;

    public MyLinkedList() {
        this.size = 0;
    }
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
            size++;
        }

    }
        
    
    public int get(int index) {
        if(head==null){
            //System.out.println("List is empty");
            return -1;
        }
        if(index < 0 || index >= size){
            return -1;
        }
        Node curr = head;
        for(int i = 0;i<index;i++){
            curr = curr.next;
        }
        return curr.val;

        
    }
    
    public void addAtHead(int val) {
        Node newnode = new Node(val);
        if (head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

        
    }
    
    public void addAtTail(int val) {
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
            return; 
        }
        //use curr key 
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newnode;
    }
    
    public void addAtIndex(int index, int val) {
        Node curr = head;
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index<0 || index>size){
            System.out.println("Invalid size");
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        for(int i = 0;i<index-1;i++){
            curr = curr.next;
        }
        Node newnode = new Node(val);
        newnode.next = curr.next;
        curr.next = newnode;
    }
    
    public void deleteAtIndex(int index) {
        //for deletion the way is strict, fixed index
        if(head == null){
            System.out.println("List is empty");
            return;

        }
        if(index == 0){
            delfirst();
            return;
        }
        if(index == size-1){
            dellast();
            return;
        }
        if(index<0 || index>= size){
            System.out.println("Invalid Index");
            return;
        }
        Node curr = head;
        for(int i=0;i<index-1;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;

    }
    public void delfirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        Node curr = head;
        head = curr.next;
    }
    
    public void dellast(){
        
        if(head == null){
            System.out.println("The List is Empty");
            return;
        }
        if(head.next == null){   // only one node — nothing to walk to
        head = null;
        size--;
        return;
        }
        size--;
        //I think we need the secondlast node and lastnode here 
        Node secondlast = head;
        Node lastnode = head.next;
        while(lastnode.next!=null){
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }
        
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */