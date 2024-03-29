class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    void solve(Node root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.data);
        solve(root.left,list);
        solve(root.right,list);
    }
    Node binaryTreeToBST(Node root)
    {
       // Your code here
       ArrayList<Integer> list=new ArrayList<>();
       solve(root,list);
       Collections.sort(list);
       return bst(list,0,list.size()-1);
    }
    Node bst(ArrayList<Integer> list,int low,int high){
        if(low>high){
            return null;
        }
        int mid=low+(high-low)/2;
        Node root=new Node(list.get(mid));
        root.left=bst(list,low,mid-1);
        root.right=bst(list,mid+1,high);
        return root;
    }
}
