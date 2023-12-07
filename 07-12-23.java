 long c=0,left=0,pre=0;
   for(int i=0;i<n;i++){
       if(arr[i]<l){
           c+=pre;
           left++;
       }
       else if(arr[i]>r) left=pre=0;
       else {
           c+=left+pre+1;
           pre+=left+1;
           left=0;
       }
   }
   return c;
