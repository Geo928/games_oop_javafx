package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return checkLine(board) || checkColumn(board);
    }

    public static boolean checkLine(int[][] board) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length - 1; j++) {
                if (board[i][j] != board[i][j + 1]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean checkColumn(int[][] board) {
        boolean result = true;
        for (int i = 0; i < board.length - 1; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != board[i + 1][j]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
