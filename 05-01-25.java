sort(arr.begin(),arr.end());
        int s =0;
        int e=arr.size()-1;
        int ans =0;
        while(s<=e){
            if(arr[s]+arr[e]>=target){
                e--;
            }
            else{
               ans+=(e-s);
               s++;
              
            }
        }
        return ans;
