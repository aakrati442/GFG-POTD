public int detectCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean aj[] = new boolean[V];
        for(int i = 0 ; i < V;i++)
        {
            if(!aj[i]  && dfs(i,adj,aj,-1))
            {
                
                    return 1;
            }
        }
        return 0;
    }
    public boolean dfs(int i , ArrayList<ArrayList<Integer>> adj,boolean[] aj,int parent){
        aj[i] = true;
        for(Integer ne : adj.get(i))
        {
         if(!aj[ne])
         {
             if(dfs(ne,adj,aj,i))
             return true;
         }
         else if(ne != parent)
         {
             return true;
             
         }
    }
    return false;
    }
