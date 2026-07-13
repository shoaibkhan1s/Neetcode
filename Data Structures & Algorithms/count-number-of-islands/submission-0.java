class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    dfs(vis, grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(boolean[][] vis, char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1 || vis[i][j] == true || grid[i][j] == '0') {
            return;
        }
        vis[i][j] = true;
        dfs(vis, grid, i - 1, j);
        dfs(vis, grid, i + 1, j);
        dfs(vis, grid, i, j - 1);
        dfs(vis, grid, i, j + 1);
    }
}