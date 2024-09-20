Queue<Integer> q=new LinkedList<>();
        q.add(height[0]);
        int count=1;
        for(int i=1;i<height.length;i++)
        {
            if(height[i]>q.peek())
            {
                q.add(height[i]);
                q.remove();
                count++;
            }
        }
        return count;
