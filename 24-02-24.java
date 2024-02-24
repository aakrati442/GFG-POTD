if(n<=11)return n;
        if(n==12)return 13;
        return maxSum(n/2)+maxSum(n/3)+maxSum(n/4);
