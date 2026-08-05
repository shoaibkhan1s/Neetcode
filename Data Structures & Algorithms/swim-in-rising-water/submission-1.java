class Solution {
    public int swimInWater(int[][] grid) {
        int low = grid[0][0];
        int high = grid[0][0];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                high = Math.max(high,grid[i][j]);
            }
        }
    int res = high;
        while(low<=high){
            int guess = (low+high)/2;
            if(bfs(grid,guess)){
                res = guess;
                high = guess-1;
            }else{
                low = guess+1;
            }
        }
        return res;
    }
    private boolean bfs(int[][] grid,int guess){
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[][] vis = new int[n][m];
        for(int[] a : vis){
            Arrays.fill(a,0);
        }
        int[] x_ = {-1,1,0,0};
        int[] y_ = {0,0,-1,1};
        q.add(new int[]{0,0});
        vis[0][0] = 1;
        while(!q.isEmpty()){
            int[] a = q.poll();
            int x = a[0]; 
            int y = a[1]; 

            for(int k=0;k<4;k++){
                int row = x + x_[k];
                int col = y + y_[k];
               
                if(isValid(row,col,n,m) && vis[row][col] !=1 && guess>=grid[row][col]){
                     if(row==n-1 && col==m-1){
                    return true;
                }
                        q.add(new int[]{row,col});
                        vis[row][col] = 1;
                }
            }
        }

return false;
    }
    private boolean isValid(int i,int j,int n,int m){
        if(i<0 || j<0 || i>=n || j>=m){
            return false;
        }
        return true;
    }
}