class Solution {
    // Return the Kth smallest element in the given BST
    private void inorder(Node root,int k,PriorityQueue<Integer> pq){
        if(root==null)return;
        
        inorder(root.left,k,pq);
        pq.add(root.data);
        while(pq.size()>k){
            pq.poll();
        }
        inorder(root.right,k,pq);
    }
    public int kthSmallest(Node root, int k) {
        // Write your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        inorder(root,k,pq);
        
        if(!pq.isEmpty() && pq.size()==k){
            return pq.poll();
        }
        return -1;
    }
}
