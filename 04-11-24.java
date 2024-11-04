unordered_map<int,vector<int>> mp;
        int n=arr.size();
        vector<vector<int>> ans;
        for(int i=0;i<n;i++){
            mp[arr[i]].push_back(i);
        }
        int i=0,j=2;
        while(i<n-2){
            j=i+2;
            while(j<n){
                int req=0-arr[i]-arr[j];
                for(auto x:mp[req]){
                    if(x>i && x<j)
                    ans.push_back({i,x,j});
                }
                j++;
            }
            i++;
        }
        return ans;
