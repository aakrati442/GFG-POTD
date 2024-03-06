char textArr[] = text.toCharArray();
        char patternArr[] = pattern.toCharArray();
        int i = 0; //to traverse the text
        int j = 0; //to traverse the 
        int ind = 1; //to add index in list
        int m = patternArr.length; //size of pattern
        int n = textArr.length; //size of text
        int flag = 0;
        ArrayList<Integer> al = new ArrayList<>(); //to store result
        while(i<n){
            if(textArr[i] == patternArr[0]){
                ind = i+1;
                while(j<m && i <n && textArr[i] == patternArr[j]){
                    i++;
                    j++;
                }
                if(j == m)
                    al.add(ind);
                i = ind;
                j = 0;
            }else
                i++;
        }
        return al;
