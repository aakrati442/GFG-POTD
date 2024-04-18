HashSet<Integer>set = new HashSet<>();
        int res[] = new int[n];
        int index=0;
        
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                res[index++] = arr[i];
            }
            else{
                set.add(arr[i]);
            }
        }
        return res;
