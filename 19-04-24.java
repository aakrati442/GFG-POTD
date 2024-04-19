ArrayList<Integer> list = new ArrayList<>();
      HashSet<Integer>set = new HashSet<>();
      
      for(int val : b){
          set.add(val);
      }
      for(int val : a){
          if(!set.contains(val)){
              list.add(val);
          }
      }
      return list;
