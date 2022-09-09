package array;

import java.util.HashSet;
import java.util.Set;

/*https://leetcode.com/problems/valid-sudoku/*/
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        Set<Character> rowSet;
        Set<Character> columnSet;
        Set<Character> squareSet;

        for (int r = 0; r < 9; r++) {
            rowSet = new HashSet<>();
            columnSet = new HashSet<>();
            squareSet = new HashSet<>();
            for (int c = 0; c < 9; c++) {
                if(board[r][c] != '.' && !rowSet.add(board[r][c])) return false;

                if(board[c][r] != '.' && !columnSet.add(board[c][r])) return false;

                int i = 3 * (r / 3) + c / 3;
                int j = 3 * (r % 3) + c % 3;
                if(board[i][j] != '.' && !squareSet.add(board[i][j])) return false;

            }
        }
        return true;
        /*Set<String> commonSet = new HashSet<>();

        for (int r = 0; r < 9; r++) {

            for (int c = 0; c < 9; c++) {
                if(board[r][c] == '.') continue;

                if(!commonSet.add(board[r][c]+"row+"+r) || !commonSet.add(board[r][c]+"column+"+c) || !commonSet.add(board[r][c]+"box+"+(3 * (r/3) + c/3)))
                    return false;
            }
        }
        return true;*/
    }

    public static void main(String[] args) {

        ValidSudoku vs = new ValidSudoku();
        System.out.println(vs.isValidSudoku(new char[][]
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}));

    }
}
