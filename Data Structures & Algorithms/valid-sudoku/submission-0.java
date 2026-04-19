class Solution {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<HashSet<Character>> row = new ArrayList<>(9);
        ArrayList<HashSet<Character>> col = new ArrayList<>(9);
        ArrayList<HashSet<Character>> box = new ArrayList<>(9);

        for(int i = 0; i < 9; i++){
            row.add(new HashSet<>());
            col.add(new HashSet<>());
            box.add(new HashSet<>());
        }

        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == ".".charAt(0)){
                    continue;
                }
                if(row.get(j).contains(board[i][j]) || col.get(i).contains(board[i][j]) || 
                    box.get(j / 3 + (i / 3) * 3).contains(board[i][j])){
                    
                    return false;
                }

                row.get(j).add(board[i][j]);
                col.get(i).add(board[i][j]);
                box.get(j / 3 + (i / 3) * 3).add(board[i][j]);
            }
        }

        return true;
    }
}
