ArrayList<Integer> al=new ArrayList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        
        for(int a: arr)map.put(a,map.getOrDefault(a,0)+1);
        
        ArrayList<Integer> temp=new ArrayList<>();
        for(int k: map.keySet()) {
        	int t1=map.get(k);
        	if(!temp.contains(t1)) temp.add(t1);
        }
        Collections.sort(temp, Collections.reverseOrder()); 
        for(int v: temp) {
        	  for(int k: map.keySet()) {        		  
        		 // System.out.println(k);        		  
        		  if(map.get(k)==v) {
        			  int t=v;
        			  while(t-->0) {
        				  al.add(k);
        			  }
        			  
        			  map.put(k, -1);
        		  }
        	  }
        }
        return al;
