long ans=0;

for(int i=0;i<32;i++){

long cnt=0;

for(int j=0;j<n;j++)

if((arr[j]&(1<<i))!=0) cnt++;

ans+=(1<<i)(cnt*(cnt-1)/2);

}

return ans;
