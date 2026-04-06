class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean r = isValidRow(board,0);
        boolean c = isValidColumn(board,0);
        boolean box = isValidBox(board,0,0);
        return (r && c && box);
        
    }
    public boolean isValidBox(char[][] board,int r,int c){
        if(r>6 ){
            return true;
        }
          HashSet<Character> set = new HashSet<>();
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j] != '.' && set.contains(board[i][j])){
                    return false;
                }
                if(board[i][j]=='.') continue;
                set.add(board[i][j]);
            }
        }
        boolean m;
        boolean n;
        if(c<6){
return isValidBox(board,r,c+3);
        }else{
      return isValidBox(board,r+3,0);
        }
       
    }


    public boolean isValidColumn(char[][] board,int c){
        if(c>8){
            return true;
        }
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<9;i++){
            if(board[i][c]!='.' && set.contains(board[i][c])){
               
                return false;
            }
            if(board[i][c]=='.') continue;
            set.add(board[i][c]);
        }
        return isValidColumn(board,c+1);
    }

    public boolean isValidRow(char[][] board,int r){
        if(r>8){
            return true;
        }
        HashSet<Character> set = new HashSet<>();
     
        for(int i =0;i<9;i++){
            if(board[r][i]!='.' && set.contains(board[r][i])){
               
                return false;
            }
            if(board[r][i]=='.') continue;
            set.add(board[r][i]);
        }
        return isValidRow(board,r+1);
    }
}
