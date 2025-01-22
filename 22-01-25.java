static Node reverse(Node head)
    {
        // 1 2 3 4
        
        if(head==null || head.next == null)
            return head;
        
        Node head1 = reverse(head.next);
        head.next.next = head;
        head.next = null;
        
        return head1;
    }
    
    static Node removeLeadingZeros(Node head) {
    
        while (head != null && head.data == 0) {
            head = head.next;
        }
   
        return head == null ? new Node(0) : head;
