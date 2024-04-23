if(n == 1 || n == 2)
        {
            return 1;
        }
        
        n = n-2;
        int i = 1;
        int j = 1;
        
        while(n > 0)
        { 
            int k = (i+j)%1000000007;
            i = j;
            j = k;
            n = (n-1)%1000000007;
        }
        
        return j;
