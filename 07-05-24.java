Queue<Node> q = new LinkedList<>();
        q.add(node);
        ArrayList<Integer> list = new ArrayList<>();
        while(!q.isEmpty()) {
            int n = q.size();
            ArrayList<Integer> l = new ArrayList<>();
            for(int i=1; i<=n; i++) {
                Node curr = q.poll();
                if(curr.left!=null) {
                    q.add(curr.left);
                }
                if(curr.right!=null) {
                    q.add(curr.right);
                }
                l.add(curr.data);
            }
            Collections.reverse(l);
            list.addAll(l);
        }
        Collections.reverse(list);
        return list;
