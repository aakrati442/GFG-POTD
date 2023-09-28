class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
         
            for(int i=0;i<n-1;i++){
            if(a[i] < a[i+1] && i%2==0){ 
            // if current element index no is even and smaller than next element then swap both;
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        // if currentelement index no is odd and larger than next element then swap both;
            else if(a[i] > a[i+1] && i%2 !=0){
                int t = a[i];
                a[i] = a[i+1];
                a[i+1] = t;
            }
        }
    }
}
