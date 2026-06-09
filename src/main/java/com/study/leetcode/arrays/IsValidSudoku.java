package com.study.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class IsValidSudoku {

    static boolean isValidSudoku(char[][] board) {
        Set<String> setBoard = new HashSet<>();

        for(int row=0;row< board.length;row++){
            for(int col=0; col< board.length;col++){
                char value = board[row][col];
                if(value != '.'){
                    String rowKey = value + " row " + row;
                    String colKey = value + " col " + col;
                    String boxKey = value + " box " + row / 3 + "-" + col / 3;

                    if (setBoard.contains(rowKey)) return false;
                    if (setBoard.contains(colKey)) return false;
                    if (setBoard.contains(boxKey)) return false;

                    setBoard.add(rowKey);
                    setBoard.add(colKey);
                    setBoard.add(boxKey);
                }
            }
        }
        return true;
    }
}
