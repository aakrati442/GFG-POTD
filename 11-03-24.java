class Solution
{
int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        int res = 0;
        for(int[] row : mat1){
            for(int num : row){
                int target = x-num;
                res += search(mat2, target);
            }
        }
        return res;
    }
    
    public int search(int[][] mat , int target){
        int n = mat.length;
        int r=0, c=n-1;
        while(r<n && c>=0){
            if(mat[r][c] == target) return 1;
            if(mat[r][c] < target) r++;
            else c--;
        }
        return 0;
}
}
