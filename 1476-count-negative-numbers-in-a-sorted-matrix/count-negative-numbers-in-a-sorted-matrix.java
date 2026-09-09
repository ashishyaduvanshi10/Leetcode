class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int r=0;r<m;r++){
            int i=0;
            int j=n-1;
            while(i<=j){
                int mid=i+(j-i)/2;
                if(grid[r][mid]>=0){
                    i=mid+1;
                }
                else j=mid-1;
            }
            count+=n-i;
        }
        return count;
        
    }
}