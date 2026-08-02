class Solution {
    class Pair{
        int row;
        int col;
        Pair(int r, int c){
            this.row = r;
            this.col = c;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int fresh=0;
        int time=0;

        //counting all fresh oranges and adding all rotten oranges into queue
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j));
                    grid[i][j] = -2;
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        //creating array for traversing in all 4 directions
        int[] x = {-1,1,0,0};
        int[] y = {0,0,-1,1};

        while(!q.isEmpty() && fresh>0){
            int s = q.size();
            time++;
            while(s!=0){
                
                Pair p = q.remove();
                int r = p.row;
                int c = p.col;

                //travesing in 4 direction and checking whether the element at that position is fresh or not
                for(int k=0;k<4;k++){
                    int row = r + x[k];
                    int col = c + y[k];
                    if(isValid(row,col,n,m) && grid[row][col]==1){
                        q.add(new Pair(row,col));
                        grid[row][col] = -2;
                        fresh--;
                    }
                }

                //decrease the size after removing the coordinates from queue
                s--;
            }
        }
        if(fresh>0){
            return -1;
        }
        return time;


    }
    private boolean isValid(int i,int j, int n,int m){
        if(i<0 || j<0 || i>=n || j>=m){
            return false;
        }
        return true;
    }
}