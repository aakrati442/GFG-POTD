if(q>2 && q<2*n)
        {
            if(q>=n+1)
                return n-(Math.abs(q-n)-1);
            else
                return n-(Math.abs(n-q)+1);
                
        }
        else if(q==2 || q==2*n)
            return 1;
        else
            return 0;
