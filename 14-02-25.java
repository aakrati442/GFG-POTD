
    // Nodes to store the two swapped nodes
    Node firstSwapped = null;
    Node secondSwapped = null;
    
    // A pointer to keep track of the previous node during inorder traversal
    Node prevNode = null;

    // Helper function to perform inorder traversal and identify the two swapped nodes
    public void inorderTraversal(Node root) {
        if (root == null) return;
        
        // Traverse the left subtree
        inorderTraversal(root.left);

        // Check if the current node is out of order (previous node is greater than current node)
        if (prevNode != null && prevNode.data > root.data) {
            // The first occurrence of swapped nodes
            if (firstSwapped == null) {
                firstSwapped = prevNode;
            }
            // The second occurrence of swapped nodes
            secondSwapped = root;
        }

        // Update the previous node to the current node
        prevNode = root;
        
        // Traverse the right subtree
        inorderTraversal(root.right);
    }

    // Main function to correct the BST by swapping the two identified nodes
    void correctBST(Node root) {
        // Step 1: Perform inorder traversal to identify the two swapped nodes
        inorderTraversal(root);
        
        // Step 2: Swap the data of the two identified nodes to restore the BST property
        int temp = firstSwapped.data;
        firstSwapped.data = secondSwapped.data;
        secondSwapped.data = temp;
