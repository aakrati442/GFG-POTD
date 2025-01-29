 if(e==0)return 1;
        if(e==1)return b;
        if (e<0)return 1/(power(b,-e));
        double powHalf=power(b,e/2);
        if(e%2==0) return powHalf*powHalf;
        else return b*powHalf*powHalf;
