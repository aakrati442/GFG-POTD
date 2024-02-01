    int arr[26]={0};
        for(int i=0;i<s.size();i++){
            if(s[i]>='A' && s[i]<='Z'){
                arr[s[i]-'A']++;
            }
            if(s[i]>='a' && s[i]<='z'){
                arr[s[i]-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                return 0;
            }
        }
        return 1;01-02-24.java
