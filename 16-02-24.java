ArrayList<Integer> l1=new ArrayList<Integer>();
        inorder(root,l1);
        
        int count=1;
          Node x=new Node(l1.get(0));
          Node prev=x;
        while(count<l1.size()){
            Node y=new Node(l1.get(count));
            prev.right=y;
            prev=y;
            count++;
        }
        return x;
