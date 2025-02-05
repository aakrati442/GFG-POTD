if( node == null){
            return;
        }

//use temp and just swap it
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        mirror(node.right);
        mirror(node.left);
         
