package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
          if (board[i][i] == 1 && (checkLine(board, i) || checkColumn(board, i))) {
              result = true;
          }
        }
        return result;
    }

    public static boolean checkLine(int[][] board, int line) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
                if (board[line][i] == 0) {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static boolean checkColumn(int[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
                if (board[i][column] == 0) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
