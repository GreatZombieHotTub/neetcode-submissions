class Solution {
    public boolean isValidSudoku(char[][] board) {
        //9+9+9 hashsets

        Set<Character>[] row= new HashSet[9];
        Set<Character>[] col= new HashSet[9];
        Set<Character>[] box= new HashSet[9];

        for(int i=0; i<9; i++){
        row[i]= new HashSet<>();
        col[i]= new HashSet<>();
        box[i]= new HashSet<>();
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){

                if(board[i][j]=='.'){
                    continue;
                }

                if(row[i].contains(board[i][j])){
                    return false;}
                row[i].add(board[i][j]);

                if(col[j].contains(board[i][j])){
                    return false;}
                col[j].add(board[i][j]);

                if(box[(3*(i/3))+(j/3)].contains(board[i][j])){
                    return false;}
                box[(3*(i/3))+(j/3)].add(board[i][j]);

            }
        }

        return true;



        
    }
}
