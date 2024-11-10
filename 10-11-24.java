Set<Integer> s=new TreeSet<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            s.add(b[i]);
        }
     return new ArrayList<>(s);
