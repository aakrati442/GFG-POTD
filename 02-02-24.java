 int ans = s.charAt(s.length()-1)-'0'; // initialze ans with unit digit or -1 for other char
        if(ans>9 || ans<0){
            return -1;
        }
        
        int ten=1; // for multiply digit with 10 in each iteration
        for(int i=1; i<s.length(); i++){
            // check first char if negative
            if(i==s.length()-1 && s.charAt(0)=='-'){
                return ans*-1;
            }
            
            int a = s.charAt(s.length()-1-i)-'0';
            ten *=10;
            
            if(a>=0 && a<=9){
                ans+=a*ten;
            }else{
                return -1;
            }
        }    
        return ans;
