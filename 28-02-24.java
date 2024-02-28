boolean flag = false;
        if(s.length() < 3){
            int si = Integer.parseInt(s);
            if(si%8 == 0){
                flag = true;
            }
        } else {
            if(s.substring(s.length()-4,s.length()).equals("000")){
                flag = true;
            } else if(Integer.parseInt(s.substring(s.length()-3,s.length())) % 8 == 0){
                flag = true;
            }
        }
        if(flag){
            return 1;
        }
        
        return -1;
