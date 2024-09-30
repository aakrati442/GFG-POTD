class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        List<Integer> sortedList = new ArrayList<>();
        inOrderTraversal(root1, sortedList);
        inOrderTraversal(root2, sortedList);
        sortedList.sort(Integer::compareTo);
        return sortedList;
    }
    
    private void inOrderTraversal(Node root, List<Integer> sortedList) {
        if (root == null) return;
        inOrderTraversal(root.left, sortedList);
        sortedList.add(root.data);
        inOrderTraversal(root.right, sortedList);
    }
}
