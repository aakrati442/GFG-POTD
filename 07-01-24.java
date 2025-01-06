// Complete the function
        int count=0;
        HashMap<Integer,Integer> k=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            k.put(arr[i],k.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(k.containsKey(target-arr[i]) && target-arr[i]!=arr[i]){
                count+=k.get(target-arr[i]);
            }
            else if(k.containsKey(target-arr[i]) && target-arr[i]==arr[i]){
                k.put(arr[i],k.get(arr[i])-1);
                count+=k.get(target-arr[i]);
                continue;
            }
            if(k.get(arr[i])>1){
                k.put(arr[i],k.get(arr[i])-1);
            }
            else{
                k.remove(arr[i]);
            }
        }
        return count;
