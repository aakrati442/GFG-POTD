vector<int>ans;
        int n = arr.size();
        for(int i=0; i<=n-k; i++){
            set<int>st;
            for(int j=i; j<k+i; j++){
                st.insert(arr[j]);
            }
            ans.push_back(st.size());
        }
        return ans;
