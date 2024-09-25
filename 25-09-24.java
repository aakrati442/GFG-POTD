Node root;
    boolean isPalindrome(Node head) {
        this.root=head;
        return find(head);
    }
    boolean find(Node head){
        if(head==null)return true;
        boolean f=find(head.next);
        if(head.data!=root.data)return false;
        root=root.next;
        return f;
