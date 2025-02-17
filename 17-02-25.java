ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=n-1;i>=n-k;i--){
            //if(i<0) break;
            list.add(arr[i]);
        }
        return list;
