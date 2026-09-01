package com.study.leetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }

    static List<String> generateParenthesis(int n) {
        int open =0;
        int close =0;
        List<String> parenthesisList = new ArrayList<>();

        backtrack(n,open,close,"",parenthesisList);

        return parenthesisList;
    }

    static void backtrack(
            int n,
            int open,
            int close,
            String current,
            List<String> result) {
        if (open == n && close == open) {
            result.add(current);
            return;
        }

        if(open<n){
            backtrack(n,open+1,close,current+"(",result);
        }

        if(close<open){
            backtrack(n,open,close+1,current+")",result);
        }
    }
}
