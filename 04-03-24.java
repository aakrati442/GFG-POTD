class Solution
{
    public void swapElements(int[] arr, int n)
    {
        // Code here
        int a;
        for(int i=0;i<n-2;i++){
            a=arr[i+2];
            arr[i+2]=arr[i];
            arr[i]=a;
        }
        
    }
}
