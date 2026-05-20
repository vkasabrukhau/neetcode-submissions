class MyLinkedList {
    class ListNode {
        int val;
        ListNode next, prev;
        ListNode(int val) { this.val = val; }
    }

    private ListNode head;
    private ListNode tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        int our_index = 0;
        ListNode current = head;
        while(our_index < index){
            our_index++;
            current = current.next;
        }
        return current != null ? current.val : -1;
    }
    
    public void addAtHead(int val) {
        ListNode new_head = new ListNode(val);
        new_head.prev = null;
        new_head.next = head;
        if(head != null){
            head.prev = new_head;
        } else {
            tail = new_head;
        }
        head = new_head;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode new_tail = new ListNode(val);
        new_tail.prev = tail;
        new_tail.next = null;
        if(tail != null){
            tail.next = new_tail;
        } else {
            head = new_tail;
        }
        tail = new_tail;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;
        if(index == 0) {
            addAtHead(val);
        } else if(index == size) {
            addAtTail(val);
        } else {
            ListNode new_node = new ListNode(val);
            ListNode current = head;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            ListNode follow = current.next;
            current.next = new_node;
            new_node.prev = current;
            new_node.next = follow;
            if (follow != null) follow.prev = new_node;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if(index == 0){
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        }else{
            ListNode current = head;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            ListNode toDelete = current.next;
            ListNode follow = toDelete.next;
            current.next = follow;
            if (follow != null) follow.prev = current;
            else tail = current;
        }
        size--;
    }
}