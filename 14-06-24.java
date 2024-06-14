 int sum=0;
        int a=n % 10;
        int b=(n / 10) % 10;
        int c=(n / 100) % 10;
        sum=sum+(a*a*a)+(b*b*b)+(c*c*c);
        if(sum==n){
            return "true";
        }
        else{
            return "false";
        }
