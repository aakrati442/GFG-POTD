if(n1.data == root.data || n2.data == root.data)
        {
            return root;
        }
        
        else if(n1.data < root.data && n2.data < root.data)
        {
            return(LCA(root.left,n1,n2));
        }
        
         else if(n1.data > root.data && n2.data > root.data)
        {
            return(LCA(root.right,n1,n2));
        }
        
        else
        {
            return root;
        }
}
