Tree n=new Tree(head.data);
        
        Node nxt=head.next;
        Queue<Tree> q=new LinkedList<>();
        q.add(n);
        while(!q.isEmpty()){
            Tree curr=q.remove();
            if(nxt != null){
                Tree t=new Tree(nxt.data);
                curr.left=t;
                q.add(curr.left);
                nxt=nxt.next;
            }
           
            if(nxt != null){
                Tree t= new Tree(nxt.data);
                curr.right=t;
                q.add(curr.right);
                nxt=nxt.next;
            }
            
        }
        return n;
