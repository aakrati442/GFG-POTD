int n = arr.size(),cs = 0;
        for(int i = 0 , j = 0; i<n; i++){
            cs += arr[i];
            while( cs > target) cs -=arr[j++];
            if(cs == target) return {j+1,i+1};
        }
        return {-1};
