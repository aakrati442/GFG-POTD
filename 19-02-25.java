Queue<Node> pq=new PriorityQueue<>((x,y)->x.data-y.data);
        for(Node h:arr) if(h!=null) pq.add(h);
        Node head=new Node(-1),curr=head;
        while(!pq.isEmpty()){
            Node node=pq.poll();
            curr.next=new Node(node.data);
            curr=curr.next;
            if(node.next!=null) pq.add(node.next);
        }
        return head.next;
