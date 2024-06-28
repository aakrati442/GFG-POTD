String str = "";
        int n = arr.length;

         //Checking for rows---because of first priority
        for(int i=0;i<n;i++){
            int[] palin = new int[n];
            for(int j=0;j<n;j++){
                palin[j] = arr[i][j];
            }
            if(palindrome(palin)){
                str = i+" R";
                return str;
            }
        }
        //Checking for columns---because of second priority...
        for(int i=0;i<n;i++){
            int[] palin = new int[n];
            for(int j=0;j<n;j++){
                palin[j] = arr[j][i];
            }
            if(palindrome(palin)){
                str = i+" C";
                return str;
            }
        }
        return "-1";
    }

//Function to check weather the given row or column is palindrome or not
    private boolean palindrome(int[] palin){
        if(palin.length==0){
            return false;
        }
        int n = palin.length;
        
        int count = 0;
        for(int i=0;i<n;i++){
            if(palin[i]!=palin[n-1-i]){
                return false;
            }
        }
        return true;
