class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        //performing flood fills:-
        int i = image[sr][sc];
        if(i==color){
            return image;
        }
        dfs(image,sr,sc,color,i);
        return image;
    }
    private void dfs(int[][] image, int sr, int sc, int color,int i){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=i){
            return;
        }
        image[sr][sc]=color;
        dfs(image,sr+1,sc,color,i);
        dfs(image,sr-1,sc,color,i);
        dfs(image,sr,sc+1,color,i);
        dfs(image,sr,sc-1,color,i);
    }
}
