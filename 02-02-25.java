 ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int l = q.size();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0;i<l;i++){
                Node x = q.poll();
                a.add(x.data);
                if(x.left!=null) q.offer(x.left);
                if(x.right!=null) q.offer(x.right);
            }
            ans.add(a);
        }
        return ans;
